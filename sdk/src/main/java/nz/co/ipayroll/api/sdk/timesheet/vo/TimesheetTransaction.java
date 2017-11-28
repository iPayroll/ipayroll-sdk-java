package nz.co.ipayroll.api.sdk.timesheet.vo;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class TimesheetTransaction extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long timesheetTransactionId;
    private BigDecimal amount;
    private BigDecimal quantity;
    private BigDecimal rate;
    private String description;
    private String costCentre;
    private String reason;
    private String leaveFrom;
    private String leaveTo;
    private String leaveDays;
    private String payElement;

    public Long getTimesheetTransactionId() {
        return timesheetTransactionId;
    }

    public void setTimesheetTransactionId(Long timesheetTransactionId) {
        this.timesheetTransactionId = timesheetTransactionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCostCentre() {
        return costCentre;
    }

    public void setCostCentre(String costCentre) {
        this.costCentre = costCentre;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getLeaveFrom() {
        return leaveFrom;
    }

    public void setLeaveFrom(String leaveFrom) {
        this.leaveFrom = leaveFrom;
    }

    public String getLeaveTo() {
        return leaveTo;
    }

    public void setLeaveTo(String leaveTo) {
        this.leaveTo = leaveTo;
    }

    public String getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(String leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getPayElement() {
        return payElement;
    }

    public void setPayElement(String payElement) {
        this.payElement = payElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TimesheetTransaction that = (TimesheetTransaction) o;
        return Objects.equals(timesheetTransactionId, that.timesheetTransactionId) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(description, that.description) &&
                Objects.equals(costCentre, that.costCentre) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(leaveFrom, that.leaveFrom) &&
                Objects.equals(leaveTo, that.leaveTo) &&
                Objects.equals(leaveDays, that.leaveDays) &&
                Objects.equals(payElement, that.payElement);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), timesheetTransactionId, amount, quantity, rate, description, costCentre, reason, leaveFrom, leaveTo, leaveDays, payElement);
    }

    @Override
    public String toString() {
        return "TimesheetTransaction{" +
                "timesheetTransactionId=" + timesheetTransactionId +
                ", amount=" + amount +
                ", quantity=" + quantity +
                ", rate=" + rate +
                ", description='" + description + '\'' +
                ", costCentre='" + costCentre + '\'' +
                ", reason='" + reason + '\'' +
                ", leaveFrom='" + leaveFrom + '\'' +
                ", leaveTo='" + leaveTo + '\'' +
                ", leaveDays='" + leaveDays + '\'' +
                ", payElement='" + payElement + '\'' +
                "} " + super.toString();
    }
}
