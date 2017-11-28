package nz.co.ipayroll.sdk.example.controllers;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpSession;

import nz.co.ipayroll.api.sdk.employee.*;
import nz.co.ipayroll.api.sdk.employee.vo.CustomField;
import nz.co.ipayroll.api.sdk.employee.vo.Employee;
import nz.co.ipayroll.api.sdk.employee.vo.LeaveBalance;
import nz.co.ipayroll.api.sdk.employee.vo.PayRate;
import nz.co.ipayroll.api.sdk.leave.request.LeaveRequestRepository;
import nz.co.ipayroll.api.sdk.leave.request.vo.LeaveRequest;
import nz.co.ipayroll.api.sdk.payelement.PayElementRepository;
import nz.co.ipayroll.api.sdk.payelement.vo.PayElement;
import nz.co.ipayroll.api.sdk.payroll.PayrollRepository;
import nz.co.ipayroll.api.sdk.payroll.vo.Payroll;
import nz.co.ipayroll.api.sdk.payslip.PayslipRepository;
import nz.co.ipayroll.api.sdk.payslip.vo.Payslip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ipayroll.api.sdk.costcentre.CostCentreRepository;
import nz.co.ipayroll.api.sdk.costcentre.vo.CostCentre;
import nz.co.ipayroll.api.sdk.oauth.AOuthClientConfiguration;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenService;
import nz.co.ipayroll.api.sdk.oauth.vo.AccessToken;
import nz.co.ipayroll.api.sdk.timesheet.TimesheetRepository;
import nz.co.ipayroll.api.sdk.timesheet.vo.Timesheet;
import nz.co.ipayroll.sdk.example.AccessTokenNotFoundException;
import retrofit2.Retrofit;

@RestController
public class DataController {

    @Autowired
    private CostCentreRepository costCentreRepository;

    @Autowired
    private TimesheetRepository timesheetRepository;

    @Autowired
    private AccessTokenService accessTokenService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeCustomFieldRepository employeeCustomFieldRepository;

    @Autowired
    private EmployeeLeaveBalanceRepository employeeLeaveBalanceRepository;
    @Autowired
    private EmployeeLeaveRequestRepository employeeLeaveRequestRepository;
    @Autowired
    private EmployeePayRateRepository employeePayRateRepository;
    @Autowired
    private LeaveRequestRepository leaveRequestRepository;
    @Autowired
    private PayElementRepository payElementRepository;
    @Autowired
    private PayrollRepository payrollRepository;
    @Autowired
    private PayslipRepository payslipRepository;

    @RequestMapping(value = "aouth2/configuration")
    public AOuthClientConfiguration aouth2Configuration(HttpSession session) throws IOException {
        return accessTokenService.getConfiguration();
    }

    @RequestMapping(value = "/timesheets/{employeeId}")
    public Timesheet getOneTmesheet(HttpSession session, @PathVariable("employeeId") String employeeId) throws IOException {
        AccessToken token = getAccessToken(session);
        return timesheetRepository.get(token.token(), employeeId).execute().body();
    }

    @RequestMapping(value = "/timesheets/{employeeId}/deleteTransaction/{transactionId}")
    public Timesheet deleteTransaction(HttpSession session,
                                       @PathVariable("employeeId") String employeeId,
                                       @PathVariable("transactionId") String transactionId) throws IOException {
        AccessToken token = getAccessToken(session);
        timesheetRepository.delete(token.token(), employeeId, transactionId).execute().body();
        return getOneTmesheet(session, employeeId);
    }

    @RequestMapping(value = "/costcentres")
    public Model<CostCentre> costcentres(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<CostCentre> resources = costCentreRepository.getAll(token.token(), 100, 0).execute().body();
        CostCentre resource = costCentreRepository.get(token.token(), 12590L).execute().body();
        return new Model<CostCentre>(resources, resource);
    }

    @RequestMapping(value = "/employeeCustomField")
    public Model<CustomField> employeeCustomFieldRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<CustomField> resources = employeeCustomFieldRepository.getAll(token.token(), "109").execute().body();
        CustomField resource = employeeCustomFieldRepository.getByCategoryAndId(token.token(), "109", "6", "6586").execute().body();
        return new Model<CustomField>(resources, resource);
    }

    @RequestMapping(value = "/employeeLeaveBalance")
    public Model<LeaveBalance> employeeLeaveBalanceRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<LeaveBalance> resources = employeeLeaveBalanceRepository.getAll(token.token(), "109").execute().body();
        LeaveBalance resource = employeeLeaveBalanceRepository.get(token.token(), "109", "In%20Service%20Training").execute().body();
        return new Model<LeaveBalance>(resources, resource);
    }

    @RequestMapping(value = "/employeeLeaveRequest")
    public Model<LeaveRequest> employeeLeaveRequestRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<LeaveRequest> resources = employeeLeaveRequestRepository.getAll(token.token(), "14").execute().body();
        LeaveRequest resource = employeeLeaveRequestRepository.get(token.token(), "14", "1069").execute().body();
        return new Model<LeaveRequest>(resources, resource);
    }

    @RequestMapping(value = "/employeePayRate")
    public Model<PayRate> employeePayRateRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<PayRate> resources = employeePayRateRepository.getAll(token.token(), "109").execute().body();
        PayRate resource = employeePayRateRepository.get(token.token(), "109", "3").execute().body();
        return new Model<PayRate>(resources, resource);
    }

    @RequestMapping(value = "/employee")
    public Model<Employee> employee(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<Employee> resources = employeeRepository.getAll(token.token()).execute().body();
        Employee resource = employeeRepository.get(token.token(), "14").execute().body();
        return new Model<Employee>(resources, resource);
    }

    @RequestMapping(value = "/leaveRequest")
    public Model<LeaveRequest> leaveRequestRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<LeaveRequest> resources = leaveRequestRepository.getAll(token.token()).execute().body();
        LeaveRequest resource = leaveRequestRepository.get(token.token(), "1069").execute().body();
        return new Model<LeaveRequest>(resources, resource);
    }

    @RequestMapping(value = "/payElement")
    public Model<PayElement> payElementRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<PayElement> resources = payElementRepository.getAll(token.token()).execute().body();
        PayElement resource = payElementRepository.get(token.token(),   "ACC FIRST%20WEEK").execute().body();
        return new Model<PayElement>(resources, resource);
    }

    @RequestMapping(value = "/payroll")
    public Model<Payroll> payrollRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<Payroll> resources = payrollRepository.getAll(token.token()).execute().body();
        Payroll resource = payrollRepository.get(token.token(),   "0003").execute().body();
        return new Model<Payroll>(resources, resource);
    }

    @RequestMapping(value = "/payslip")
    public Model<Payslip> payslipRepository(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<Payslip> resources = payslipRepository.getAll(token.token()).execute().body();
        Payslip resource = payslipRepository.getByEmployeeId(token.token(),   "977659").execute().body();
        payslipRepository.getAllByPayroll(token.token(), "0130");
        payslipRepository.getByPayrollAndByEmployeeId(token.token(),"0130", "977659");
        return new Model<Payslip>(resources, resource);
    }

    @RequestMapping(value = "/timesheets")
    public Model<Timesheet> timesheets(HttpSession session) throws IOException {
        AccessToken token = getAccessToken(session);
        PagedResources<Timesheet> resources = timesheetRepository.getAll(token.token(), 100, 0).execute().body();
        Timesheet resource = timesheetRepository.get(token.token(),   "653972").execute().body();
        return new Model<Timesheet>(resources, resource);

    }

    private AccessToken getAccessToken(HttpSession session) {
        AccessToken token = (AccessToken) session.getAttribute(HtmlController.IPAYROLL_TOKEN);
        if (token == null) {
            throw new AccessTokenNotFoundException();
        }
        return token;
    }

    public static class Model<T> {
        private PagedResources<T> resources;
        private T get;

        public Model(PagedResources<T> resources, T get) {
            this.resources = resources;
            this.get = get;
        }

        public PagedResources<T> getResources() {
            return resources;
        }

        public T getGet() {
            return get;
        }
    }

}
