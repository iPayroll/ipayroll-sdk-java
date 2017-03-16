package nz.co.ipayroll.sdk.employee;

import nz.co.ipayroll.sdk.employee.vo.Employee;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

@Repository
public interface EmployeeRepository {

    @GET("employees")
    Call<PagedResources<Employee>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}")
    Call<Employee> getById(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

    @POST("employees")
    Call<List<Employee>> create(
            @Header("Authorization") String accessToken,
            @Body List<Employee> employees
    );
}
