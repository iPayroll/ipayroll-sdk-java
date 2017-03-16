package nz.co.ipayroll.sdk.leave.balance.vo;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.math.BigDecimal;

public class LeaveBalance extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String employeeId;
    private BigDecimal entitled;
    private BigDecimal accrued;
    private BigDecimal taken;
    private BigDecimal balance;
    private LeaveBalanceType leaveBalanceType;

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

    @Override
    public String toString() {
        return "LeaveBalance{"
                + "employeeId='" + employeeId + '\'' + ", entitled='" + entitled + '\'' + ", accrued='" + entitled
                + '\'' + ", accrued='" + accrued + '\'' + ", taken=" + taken + ", balance=" + balance + ", leaveBalanceType="
                + leaveBalanceType + '}';
    }


}
