package nz.co.ipayroll.api.sdk.employee.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class LeaveBalance extends ResourceBase {

    private String employeeId;
    private BigDecimal entitled;
    private BigDecimal accrued;
    private BigDecimal taken;
    private BigDecimal balance;
    private LeaveBalanceType leaveBalanceType;
    private String nextAnniversaryDate;
    private String lastAnniversaryDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getEntitled() {
        return entitled;
    }

    public void setEntitled(BigDecimal entitled) {
        this.entitled = entitled;
    }

    public BigDecimal getAccrued() {
        return accrued;
    }

    public void setAccrued(BigDecimal accrued) {
        this.accrued = accrued;
    }

    public BigDecimal getTaken() {
        return taken;
    }

    public void setTaken(BigDecimal taken) {
        this.taken = taken;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LeaveBalanceType getLeaveBalanceType() {
        return leaveBalanceType;
    }

    public void setLeaveBalanceType(LeaveBalanceType leaveBalanceType) {
        this.leaveBalanceType = leaveBalanceType;
    }

    public String getNextAnniversaryDate() {
        return nextAnniversaryDate;
    }

    public void setNextAnniversaryDate(String nextAnniversaryDate) {
        this.nextAnniversaryDate = nextAnniversaryDate;
    }

    public String getLastAnniversaryDate() {
        return lastAnniversaryDate;
    }

    public void setLastAnniversaryDate(String lastAnniversaryDate) {
        this.lastAnniversaryDate = lastAnniversaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LeaveBalance that = (LeaveBalance) o;
        return Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(entitled, that.entitled) &&
                Objects.equals(accrued, that.accrued) &&
                Objects.equals(taken, that.taken) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(leaveBalanceType, that.leaveBalanceType) &&
                Objects.equals(nextAnniversaryDate, that.nextAnniversaryDate) &&
                Objects.equals(lastAnniversaryDate, that.lastAnniversaryDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), employeeId, entitled, accrued, taken, balance, leaveBalanceType, nextAnniversaryDate, lastAnniversaryDate);
    }

    @Override
    public String toString() {
        return "LeaveBalance{" +
                "employeeId='" + employeeId + '\'' +
                ", entitled=" + entitled +
                ", accrued=" + accrued +
                ", taken=" + taken +
                ", balance=" + balance +
                ", leaveBalanceType=" + leaveBalanceType +
                ", nextAnniversaryDate='" + nextAnniversaryDate + '\'' +
                ", lastAnniversaryDate='" + lastAnniversaryDate + '\'' +
                "} " + super.toString();
    }


}
