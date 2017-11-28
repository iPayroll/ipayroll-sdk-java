package nz.co.ipayroll.api.sdk.payelement.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class LeaveEntitlementRule {

    private Integer startsAfterYears;
    private Integer startsAfterMonths;
    private Integer frequencyYears;
    private Integer frequencyMonths;
    private BigDecimal entitlementDays;
    private BigDecimal entitlementMaxDays;
    private String leaveAccrualMethod;
    private String accrualPercentage;

    public Integer getStartsAfterYears() {
        return startsAfterYears;
    }

    public void setStartsAfterYears(Integer startsAfterYears) {
        this.startsAfterYears = startsAfterYears;
    }

    public Integer getStartsAfterMonths() {
        return startsAfterMonths;
    }

    public void setStartsAfterMonths(Integer startsAfterMonths) {
        this.startsAfterMonths = startsAfterMonths;
    }

    public Integer getFrequencyYears() {
        return frequencyYears;
    }

    public void setFrequencyYears(Integer frequencyYears) {
        this.frequencyYears = frequencyYears;
    }

    public Integer getFrequencyMonths() {
        return frequencyMonths;
    }

    public void setFrequencyMonths(Integer frequencyMonths) {
        this.frequencyMonths = frequencyMonths;
    }

    public BigDecimal getEntitlementDays() {
        return entitlementDays;
    }

    public void setEntitlementDays(BigDecimal entitlementDays) {
        this.entitlementDays = entitlementDays;
    }

    public BigDecimal getEntitlementMaxDays() {
        return entitlementMaxDays;
    }

    public void setEntitlementMaxDays(BigDecimal entitlementMaxDays) {
        this.entitlementMaxDays = entitlementMaxDays;
    }

    public String getLeaveAccrualMethod() {
        return leaveAccrualMethod;
    }

    public void setLeaveAccrualMethod(String leaveAccrualMethod) {
        this.leaveAccrualMethod = leaveAccrualMethod;
    }

    public String getAccrualPercentage() {
        return accrualPercentage;
    }

    public void setAccrualPercentage(String accrualPercentage) {
        this.accrualPercentage = accrualPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveEntitlementRule that = (LeaveEntitlementRule) o;
        return Objects.equals(startsAfterYears, that.startsAfterYears) &&
                Objects.equals(startsAfterMonths, that.startsAfterMonths) &&
                Objects.equals(frequencyYears, that.frequencyYears) &&
                Objects.equals(frequencyMonths, that.frequencyMonths) &&
                Objects.equals(entitlementDays, that.entitlementDays) &&
                Objects.equals(entitlementMaxDays, that.entitlementMaxDays) &&
                Objects.equals(leaveAccrualMethod, that.leaveAccrualMethod) &&
                Objects.equals(accrualPercentage, that.accrualPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startsAfterYears, startsAfterMonths, frequencyYears, frequencyMonths, entitlementDays, entitlementMaxDays, leaveAccrualMethod, accrualPercentage);
    }

    @Override
    public String toString() {
        return "LeaveEntitlementRule{" +
                "startsAfterYears=" + startsAfterYears +
                ", startsAfterMonths=" + startsAfterMonths +
                ", frequencyYears=" + frequencyYears +
                ", frequencyMonths=" + frequencyMonths +
                ", entitlementDays=" + entitlementDays +
                ", entitlementMaxDays=" + entitlementMaxDays +
                ", leaveAccrualMethod='" + leaveAccrualMethod + '\'' +
                ", accrualPercentage='" + accrualPercentage + '\'' +
                '}';
    }
}
