package nz.co.ipayroll.sdk.leave.balance;

import nz.co.ipayroll.sdk.leave.balance.vo.LeaveBalance;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;


@Repository
public interface LeaveBalanceRepository {

    @GET("employees/{employeeId}/leaves/balances")
    Call<PagedResources<LeaveBalance>> getByEmployeeId(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/leaves/balances/{name}")
    Call<LeaveBalance> getByEmployeeIdAndLeaveTypeName(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("name") String name);
}
