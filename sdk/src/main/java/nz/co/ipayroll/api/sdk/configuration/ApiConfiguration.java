package nz.co.ipayroll.api.sdk.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nz.co.ipayroll.api.sdk.employee.*;
import nz.co.ipayroll.api.sdk.leave.request.LeaveRequestRepository;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenRepository;
import nz.co.ipayroll.api.sdk.costcentre.CostCentreRepository;
import nz.co.ipayroll.api.sdk.payelement.PayElementRepository;
import nz.co.ipayroll.api.sdk.payroll.PayrollRepository;
import nz.co.ipayroll.api.sdk.payslip.PayslipRepository;
import nz.co.ipayroll.api.sdk.timesheet.TimesheetRepository;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

@Configuration
@PropertySource("classpath:application.default.properties")
@PropertySource("classpath:application.properties")
@ComponentScan("nz.co.ipayroll.api.sdk")
public class ApiConfiguration {

    @Value("${ipayroll_server}")
    private String baseUrl;


    public static final String OAUTH_RESOURCE = "/oauth/";
    public static final String API_BASE_RESOURCE = "/api/v1/";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    @Bean
    public Retrofit ipayrollRetrofit() {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(baseUrl + API_BASE_RESOURCE)
                .addConverterFactory(GsonConverterFactory.create());

        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor = logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = httpClient
                .addInterceptor(chain -> {
                    Request original = chain.request();
                    Request.Builder requestBuilder = original.newBuilder()
                            .header("Content-Type", "application/json").method(original.method(), original.body());

                    return chain.proceed(requestBuilder.build());
                })
                .addInterceptor(logInterceptor)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build();

        return retrofitBuilder.client(client).build();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public CostCentreRepository costCentreRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(CostCentreRepository.class);
    }

    @Bean
    public EmployeeCustomFieldRepository employeeCustomFieldRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(EmployeeCustomFieldRepository.class);
    }

    @Bean
    public EmployeeRepository employeeRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(EmployeeRepository.class);
    }

    @Bean
    public EmployeeLeaveBalanceRepository employeeLeaveBalanceRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(EmployeeLeaveBalanceRepository.class);
    }

    @Bean
    public EmployeeLeaveRequestRepository employeeLeaveRequestRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(EmployeeLeaveRequestRepository.class);
    }

    @Bean
    public EmployeePayRateRepository employeePayRateRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(EmployeePayRateRepository.class);
    }

    @Bean
    public LeaveRequestRepository leaveRequestRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(LeaveRequestRepository.class);
    }

    @Bean
    public PayElementRepository payElementRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(PayElementRepository.class);
    }

    @Bean
    public PayrollRepository payrollRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(PayrollRepository.class);
    }

    @Bean
    public PayslipRepository payslipRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(PayslipRepository.class);
    }

    @Bean
    public TimesheetRepository timesheetRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(TimesheetRepository.class);
    }

    @Bean
    public AccessTokenRepository accessTokenRepository() {
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl + OAUTH_RESOURCE)
                .addConverterFactory(GsonConverterFactory.create(gson)).build();

        return retrofit.create(AccessTokenRepository.class);
    }
}
