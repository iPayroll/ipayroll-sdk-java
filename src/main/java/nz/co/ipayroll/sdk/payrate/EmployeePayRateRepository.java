package nz.co.ipayroll.sdk.payrate;

import nz.co.ipayroll.sdk.payrate.vo.EmployeePayRate;
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
    Call<PagedResources<EmployeePayRate>> getAllByEmployeeId(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Query("size") int size,
            @Query("page") int page
    );

    @GET("employees/{employeeId}/payrates/{code}")
    Call<EmployeePayRate> getByEmployeeIdAndCode(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("code") String code
    );
}
