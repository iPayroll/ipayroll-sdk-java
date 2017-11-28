package nz.co.ipayroll.api.sdk.employee;

import nz.co.ipayroll.api.sdk.leave.request.vo.LeaveRequest;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Repository
public interface EmployeeLeaveRequestRepository {

    @GET("employees/{employeeId}/leaves/requests")
    Call<PagedResources<LeaveRequest>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/leaves/requests")
    Call<PagedResources<LeaveRequest>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

    @GET("employees/{employeeId}/leaves/requests/{id}")
    Call<LeaveRequest> get(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("id") String id,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/leaves/requests/{id}")
    Call<LeaveRequest> get(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("id") String id);


    @GET("employees/{employeeId}/leaves/requests/current")
    Call<PagedResources<LeaveRequest>> listOutstanding(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/leaves/requests/current")
    Call<PagedResources<LeaveRequest>> listOutstanding(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

}
