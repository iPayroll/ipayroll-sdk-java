package nz.co.ipayroll.api.sdk.payslip.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class PayslipLeaveBalance {

    private String balanceName;
    private BigDecimal hours;
    private BigDecimal days;
    private BigDecimal amount;

    public String getBalanceName() {
        return balanceName;
    }

    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayslipLeaveBalance that = (PayslipLeaveBalance) o;
        return Objects.equals(balanceName, that.balanceName) &&
                Objects.equals(hours, that.hours) &&
                Objects.equals(days, that.days) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balanceName, hours, days, amount);
    }

    @Override
    public String toString() {
        return "PayslipLeaveBalance{" +
                "balanceName='" + balanceName + '\'' +
                ", hours=" + hours +
                ", days=" + days +
                ", amount=" + amount +
                '}';
    }
}
