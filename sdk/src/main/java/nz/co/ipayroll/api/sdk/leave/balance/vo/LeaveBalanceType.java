package nz.co.ipayroll.api.sdk.leave.balance.vo;

import java.io.Serializable;

public class LeaveBalanceType implements Serializable {
    private static final long serialVersionUID = 1L;

    private String leaveType;
    private String name;
    private String unit;

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "{"
                + "leaveType='" + leaveType + '\'' + ", name='" + name + '\'' + ", unit='" + unit
                + '\'' + '}';
    }


}
