package nz.co.ipayroll.api.sdk.payroll.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;

import java.util.List;
import java.util.Objects;

public class Payroll extends ResourceBase {

    private String payrollNumber;
    private String payDate;
    private String message;
    private String status;
    private String payrollType;
    private List<PayrollPayFrequency> payFrequencies;

    public String getPayrollNumber() {
        return payrollNumber;
    }

    public void setPayrollNumber(String payrollNumber) {
        this.payrollNumber = payrollNumber;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayrollType() {
        return payrollType;
    }

    public void setPayrollType(String payrollType) {
        this.payrollType = payrollType;
    }

    public List<PayrollPayFrequency> getPayFrequencies() {
        return payFrequencies;
    }

    public void setPayFrequencies(List<PayrollPayFrequency> payFrequencies) {
        this.payFrequencies = payFrequencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Payroll payroll = (Payroll) o;
        return Objects.equals(payrollNumber, payroll.payrollNumber) &&
                Objects.equals(payDate, payroll.payDate) &&
                Objects.equals(message, payroll.message) &&
                Objects.equals(status, payroll.status) &&
                Objects.equals(payrollType, payroll.payrollType) &&
                Objects.equals(payFrequencies, payroll.payFrequencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), payrollNumber, payDate, message, status, payrollType, payFrequencies);
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollNumber='" + payrollNumber + '\'' +
                ", payDate='" + payDate + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", payrollType='" + payrollType + '\'' +
                ", payFrequencies=" + payFrequencies +
                "} " + super.toString();
    }
}
