package nz.co.ipayroll.api.sdk.employee;

import nz.co.ipayroll.api.sdk.costcentre.vo.CostCentre;
import nz.co.ipayroll.api.sdk.employee.vo.Employee;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

@Repository
public interface EmployeeRepository {

    @GET("employees")
    Call<PagedResources<Employee>> getAll(
            @Header("Authorization") String accessToken
    );

    @GET("employees")
    Call<PagedResources<Employee>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}")
    Call<Employee> get(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

    @POST("employees")
    Call<List<Employee>> create(
            @Header("Authorization") String accessToken,
            @Body List<Employee> employees
    );

    @PUT("employees/{employeeId}")
    Call<List<Employee>> update(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Body Employee employee
    );


}
