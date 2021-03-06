package nz.co.ipayroll.api.sdk.timesheet;

import nz.co.ipayroll.api.sdk.timesheet.vo.Timesheet;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

@Repository
public interface TimesheetRepository {

    @GET("timesheets")
    Call<PagedResources<Timesheet>> getAll(
            @Header("Authorization") String accessToken
    );

    @GET("timesheets")
    Call<PagedResources<Timesheet>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page
    );

    @GET("timesheets/{employeeId}")
    Call<Timesheet> get(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId
    );

    @POST("timesheets")
    Call<List<Timesheet>> create(
            @Header("Authorization") String accessToken,
            @Body List<Timesheet> timesheets
    );

    @DELETE("timesheets/{employeeId}/transactions/{timesheetTransactionId}")
    Call<Void> delete(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("timesheetTransactionId") String timesheetTransactionId
    );

}
