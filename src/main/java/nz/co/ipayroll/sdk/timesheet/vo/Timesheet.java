package nz.co.ipayroll.sdk.timesheet.vo;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Timesheet extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String employeeId;
    private BigDecimal daysInPeriod;
    private BigDecimal totalHours;
    private List<TimesheetTransaction> transactions;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getDaysInPeriod() {
        return daysInPeriod;
    }

    public void setDaysInPeriod(BigDecimal daysInPeriod) {
        this.daysInPeriod = daysInPeriod;
    }

    public BigDecimal getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(BigDecimal totalHours) {
        this.totalHours = totalHours;
    }

    public List<TimesheetTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TimesheetTransaction> transactions) {
        this.transactions = transactions;
    }
}
