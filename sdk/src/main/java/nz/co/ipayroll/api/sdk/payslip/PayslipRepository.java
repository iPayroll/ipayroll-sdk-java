package nz.co.ipayroll.api.sdk.payslip;

import nz.co.ipayroll.api.sdk.payslip.vo.Payslip;
import org.springframework.hateoas.PagedResources;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PayslipRepository {

    @GET("payslips")
    Call<PagedResources<Payslip>> getAll(
            @Header("Authorization") String accessToken
    );

    @GET("payslips")
    Call<PagedResources<Payslip>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page);

    @GET("payslips/{payrollId}")
    Call<PagedResources<Payslip>> getAllByPayroll(
            @Header("Authorization") String accessToken,
            @Path("payrollId") String payrollId);

    @GET("payslips/{payrollId}")
    Call<PagedResources<Payslip>> getAllByPayroll(
            @Header("Authorization") String accessToken,
            @Path("payrollId") String payrollId,
            @Query("size") int size,
            @Query("page") int page);

    @GET("payslips/employees/{employeeId}")
    Call<Payslip> getByEmployeeId(
            @Header("Authorization") String accessToken,
            @Path("employeeId") String employeeId);

    @GET("payslips/{payrollId}/employees/{employeeId}")
    Call<Payslip> getByPayrollAndByEmployeeId(
            @Header("Authorization") String accessToken,
            @Path("payrollId") String payrollId,
            @Path("employeeId") String employeeId);

}
