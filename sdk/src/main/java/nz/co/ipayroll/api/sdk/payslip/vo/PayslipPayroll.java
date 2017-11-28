package nz.co.ipayroll.api.sdk.payslip.vo;

import java.util.Objects;

public class PayslipPayroll {

    private String payrollNumber;
    private String payDate;
    private String message;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayslipPayroll that = (PayslipPayroll) o;
        return Objects.equals(payrollNumber, that.payrollNumber) &&
                Objects.equals(payDate, that.payDate) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payrollNumber, payDate, message);
    }

    @Override
    public String toString() {
        return "PayslipPayroll{" +
                "payrollNumber='" + payrollNumber + '\'' +
                ", payDate='" + payDate + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
