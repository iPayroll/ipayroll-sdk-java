package nz.co.ipayroll.api.sdk.employee;

import nz.co.ipayroll.api.sdk.employee.vo.CustomField;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.*;

@Repository
public interface EmployeeCustomFieldRepository {

    @GET("employees/{employeeId}/customfields")
    Call<PagedResources<CustomField>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/customfields")
    Call<PagedResources<CustomField>> getAll(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

    @GET("employees/{employeeId}/customfields/{categoryId}")
    Call<PagedResources<CustomField>> getAllByCategory(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("categoryId") String categoryId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("employees/{employeeId}/customfields/{categoryId}/{id}")
    Call<CustomField> getByCategoryAndId(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId,
            @Path("categoryId") String categoryId,
            @Path("categoryId") String id);

}
