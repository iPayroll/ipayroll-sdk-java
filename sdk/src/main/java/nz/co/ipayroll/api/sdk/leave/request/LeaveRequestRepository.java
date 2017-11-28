package nz.co.ipayroll.api.sdk.leave.request;

import nz.co.ipayroll.api.sdk.leave.request.vo.LeaveRequest;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

@Repository
public interface LeaveRequestRepository {

    @GET("leaves/requests")
    Call<PagedResources<LeaveRequest>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page);

    @GET("leaves/requests")
    Call<PagedResources<LeaveRequest>> getAll(
            @Header("Authorization") String accessToken);

    @GET("leaves/requests/{id}")
    Call<LeaveRequest> get(
            @Header("Authorization") String accessToken,
            @Path("id") String id);


    @GET("leaves/requests/current")
    Call<PagedResources<LeaveRequest>> listOutstanding(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page);


    @POST("leaves/requests")
    Call<List<LeaveRequest>> create(
            @Header("Authorization") String accessToken,
            @Body List<LeaveRequest> leaveRequest
    );

    @PUT("leaves/requests/{leaveRequestId}")
    Call<LeaveRequest> update(
            @Header("Authorization") String accessToken,
            @Path("leaveRequestId") String leaveRequestId,
            @Body LeaveRequest leaveRequest
    );
}
