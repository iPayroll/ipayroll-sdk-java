package nz.co.ipayroll.api.sdk.employee;

import nz.co.ipayroll.api.sdk.employee.vo.PayRate;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;


@Repository
public interface EmployeePayRateRepository {

    @GET("employees/{employeeId}/payrates")
    Call<PagedResources<PayRate>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/payrates")
    Call<PagedResources<PayRate>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

    @GET("employees/{employeeId}/payrates/{id}")
    Call<PayRate> get(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("id") String id);
}
