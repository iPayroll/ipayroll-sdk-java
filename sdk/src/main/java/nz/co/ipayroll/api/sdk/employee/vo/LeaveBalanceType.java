package nz.co.ipayroll.api.sdk.employee.vo;

import java.io.Serializable;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveBalanceType that = (LeaveBalanceType) o;
        return Objects.equals(leaveType, that.leaveType) &&
                Objects.equals(name, that.name) &&
                Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(leaveType, name, unit);
    }

    @Override
    public String toString() {
        return "{"
                + "leaveType='" + leaveType + '\'' + ", name='" + name + '\'' + ", unit='" + unit
                + '\'' + '}';
    }


}
