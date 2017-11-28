package nz.co.ipayroll.api.sdk.timesheet.vo;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Timesheet extends ResourceSupport {

    private String employeeId;
    private BigDecimal daysInPeriod;
    private BigDecimal totalHours;
    private String paidToDate;
    private String paidFromDate;
    private String message;
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

    public String getPaidToDate() {
        return paidToDate;
    }

    public void setPaidToDate(String paidToDate) {
        this.paidToDate = paidToDate;
    }

    public String getPaidFromDate() {
        return paidFromDate;
    }

    public void setPaidFromDate(String paidFromDate) {
        this.paidFromDate = paidFromDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<TimesheetTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TimesheetTransaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Timesheet timesheet = (Timesheet) o;
        return Objects.equals(employeeId, timesheet.employeeId) &&
                Objects.equals(daysInPeriod, timesheet.daysInPeriod) &&
                Objects.equals(totalHours, timesheet.totalHours) &&
                Objects.equals(paidToDate, timesheet.paidToDate) &&
                Objects.equals(paidFromDate, timesheet.paidFromDate) &&
                Objects.equals(message, timesheet.message) &&
                Objects.equals(transactions, timesheet.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId, daysInPeriod, totalHours, paidToDate, paidFromDate, message, transactions);
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "employeeId='" + employeeId + '\'' +
                ", daysInPeriod=" + daysInPeriod +
                ", totalHours=" + totalHours +
                ", paidToDate='" + paidToDate + '\'' +
                ", paidFromDate='" + paidFromDate + '\'' +
                ", message='" + message + '\'' +
                ", transactions=" + transactions +
                "} " + super.toString();
    }
}
