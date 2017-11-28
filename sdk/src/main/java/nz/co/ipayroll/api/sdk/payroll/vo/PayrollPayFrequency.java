package nz.co.ipayroll.api.sdk.payroll.vo;

import java.util.Objects;

public class PayrollPayFrequency {

    private String payrollNumber;
    private Boolean included;
    private String paidToDate;

    public String getPayrollNumber() {
        return payrollNumber;
    }

    public void setPayrollNumber(String payrollNumber) {
        this.payrollNumber = payrollNumber;
    }

    public Boolean getIncluded() {
        return included;
    }

    public void setIncluded(Boolean included) {
        this.included = included;
    }

    public String getPaidToDate() {
        return paidToDate;
    }

    public void setPaidToDate(String paidToDate) {
        this.paidToDate = paidToDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayrollPayFrequency that = (PayrollPayFrequency) o;
        return Objects.equals(payrollNumber, that.payrollNumber) &&
                Objects.equals(included, that.included) &&
                Objects.equals(paidToDate, that.paidToDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(payrollNumber, included, paidToDate);
    }

    @Override
    public String toString() {
        return "PayrollPayFrequency{" +
                "payrollNumber='" + payrollNumber + '\'' +
                ", included=" + included +
                ", paidToDate='" + paidToDate + '\'' +
                '}';
    }
}
