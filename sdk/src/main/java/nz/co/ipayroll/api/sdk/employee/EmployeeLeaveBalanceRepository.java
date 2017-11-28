package nz.co.ipayroll.api.sdk.employee;

import nz.co.ipayroll.api.sdk.employee.vo.LeaveBalance;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;


@Repository
public interface EmployeeLeaveBalanceRepository {

    @GET("employees/{employeeId}/leaves/balances")
    Call<PagedResources<LeaveBalance>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/leaves/balances")
    Call<PagedResources<LeaveBalance>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

    @GET("employees/{employeeId}/leaves/balances/{id}")
    Call<LeaveBalance> get(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("id") String id);
}
