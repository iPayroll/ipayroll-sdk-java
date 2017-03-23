package nz.co.ipayroll.api.sdk.configuration;

import nz.co.ipayroll.api.sdk.oauth.AccessTokenRepository;
import nz.co.ipayroll.api.sdk.costcentre.CostCentreRepository;
import nz.co.ipayroll.api.sdk.payrate.EmployeePayRateRepository;
import nz.co.ipayroll.api.sdk.employee.EmployeeRepository;
import nz.co.ipayroll.api.sdk.leave.balance.LeaveBalanceRepository;
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

@Configuration
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
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

        OkHttpClient client = httpClient
                .addInterceptor(chain -> {
                    Request original = chain.request();
                    Request.Builder requestBuilder = original.newBuilder()
                            .header("Content-Type", "application/json").method(original.method(), original.body());

                    return chain.proceed(requestBuilder.build());
                })
                .addInterceptor(logInterceptor).build();

        return retrofitBuilder.client(client).build();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public EmployeeRepository employeeRepository(Retrofit ipayrollRetrofit) {
        return ipayrollRetrofit.create(EmployeeRepository.class);
    }

    @Bean
    public LeaveBalanceRepository leaveBalanceRepository(Retrofit ipayrollRetrofit) { return ipayrollRetrofit.create(LeaveBalanceRepository.class);}

    @Bean
    public CostCentreRepository costCentreRepository(Retrofit ipayrollRetrofit) { return ipayrollRetrofit.create(CostCentreRepository.class);}

    @Bean
    public EmployeePayRateRepository employeePayRateRepository(Retrofit ipayrollRetrofit) { return ipayrollRetrofit.create(EmployeePayRateRepository.class);}

    @Bean
    public TimesheetRepository timesheetRepository(Retrofit ipayrollRetrofit) { return ipayrollRetrofit.create(TimesheetRepository.class);}

    @Bean
    public AccessTokenRepository accessTokenRepository(){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(baseUrl + OAUTH_RESOURCE)
                .addConverterFactory(GsonConverterFactory.create()).build();

    return retrofit.create(AccessTokenRepository.class);
    }
}
