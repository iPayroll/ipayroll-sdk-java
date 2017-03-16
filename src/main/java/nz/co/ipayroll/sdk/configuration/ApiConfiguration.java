package nz.co.ipayroll.sdk.configuration;

import nz.co.ipayroll.sdk.oauth.AccessTokenRepository;
import nz.co.ipayroll.sdk.costcentre.CostCentreRepository;
import nz.co.ipayroll.sdk.payrate.EmployeePayRateRepository;
import nz.co.ipayroll.sdk.employee.EmployeeRepository;
import nz.co.ipayroll.sdk.leave.balance.LeaveBalanceRepository;
import nz.co.ipayroll.sdk.timesheet.TimesheetRepository;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class ApiConfiguration {

    // TODO: 17/03/17 move to a property file
    public static final String OAUTH_BASE_URL = "http://systest.ipayroll.co.nz/oauth/";
    public static final String API_BASE_URL = "http://systest.ipayroll.co.nz/api/v1/";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    @Bean
    public Retrofit ipayrollRetrofit() {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());

        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

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
                .baseUrl(OAUTH_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

    return retrofit.create(AccessTokenRepository.class);
    }
}
