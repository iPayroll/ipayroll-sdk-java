package nz.co.ipayroll.api.sdk.leave.request.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;
import nz.co.ipayroll.api.sdk.employee.vo.LeaveBalanceType;

import java.math.BigDecimal;
import java.util.Objects;

public class LeaveRequest extends ResourceBase {

    private Integer requestId;
    private String employeeId;
    private BigDecimal hours;
    private BigDecimal days;
    private String leaveFromDate;
    private String leaveToDate;
    private String reason;
    private String status;
    private String payElement;
    private LeaveBalanceType leaveBalanceType;
    private Integer payElementId;
    private BigDecimal quantity;

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }

    public BigDecimal getDays() {
        return days;
    }

    public void setDays(BigDecimal days) {
        this.days = days;
    }

    public String getLeaveFromDate() {
        return leaveFromDate;
    }

    public void setLeaveFromDate(String leaveFromDate) {
        this.leaveFromDate = leaveFromDate;
    }

    public String getLeaveToDate() {
        return leaveToDate;
    }

    public void setLeaveToDate(String leaveToDate) {
        this.leaveToDate = leaveToDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayElement() {
        return payElement;
    }

    public void setPayElement(String payElement) {
        this.payElement = payElement;
    }

    public LeaveBalanceType getLeaveBalanceType() {
        return leaveBalanceType;
    }

    public void setLeaveBalanceType(LeaveBalanceType leaveBalanceType) {
        this.leaveBalanceType = leaveBalanceType;
    }

    public Integer getPayElementId() {
        return payElementId;
    }

    public void setPayElementId(Integer payElementId) {
        this.payElementId = payElementId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LeaveRequest that = (LeaveRequest) o;
        return Objects.equals(requestId, that.requestId) &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(hours, that.hours) &&
                Objects.equals(days, that.days) &&
                Objects.equals(leaveFromDate, that.leaveFromDate) &&
                Objects.equals(leaveToDate, that.leaveToDate) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(status, that.status) &&
                Objects.equals(payElement, that.payElement) &&
                Objects.equals(leaveBalanceType, that.leaveBalanceType) &&
                Objects.equals(payElementId, that.payElementId) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), requestId, employeeId, hours, days, leaveFromDate, leaveToDate, reason, status, payElement, leaveBalanceType, payElementId, quantity);
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "requestId=" + requestId +
                ", employeeId='" + employeeId + '\'' +
                ", hours=" + hours +
                ", days=" + days +
                ", leaveFromDate='" + leaveFromDate + '\'' +
                ", leaveToDate='" + leaveToDate + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                ", payElement='" + payElement + '\'' +
                ", leaveBalanceType=" + leaveBalanceType +
                ", payElementId=" + payElementId +
                ", quantity=" + quantity +
                "} " + super.toString();
    }
}
