package nz.co.ipayroll.api.sdk.payroll;

import nz.co.ipayroll.api.sdk.payroll.vo.Payroll;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

@Repository
public interface PayrollRepository {

    @GET("payrolls")
    Call<PagedResources<Payroll>> getAll(
            @Header("Authorization") String accessToken
    );

    @GET("payrolls")
    Call<PagedResources<Payroll>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page);

    @GET("payrolls/{payrollId}")
    Call<Payroll> get(
            @Header("Authorization") String accessToken,
            @Path("payrollId") String payrollId);

    @GET("payrolls/current")
    Call<Payroll> getCurrent(
            @Header("Authorization") String accessToken);


    @POST("payrolls")
    Call<List<Payroll>> create(
            @Header("Authorization") String accessToken,
            @Body List<Payroll> payrolls
    );
}
