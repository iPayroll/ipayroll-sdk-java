package nz.co.ipayroll.api.sdk.payslip.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;
import nz.co.ipayroll.api.sdk.timesheet.vo.Timesheet;
import nz.co.ipayroll.api.sdk.timesheet.vo.TimesheetTransaction;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Payslip extends ResourceBase {

    private BigDecimal totalPayments;
    private BigDecimal overpayment;
    private BigDecimal taxCredit;
    private Map<String, String> yearToDateTotals;
    private BigDecimal nettPay;
    private String abn;
    private String payslipMessage;
    private List<PayslipPayrollEmployeeTransaction> deductions;
    private List<PayslipPayrollEmployeeTransaction> otherBenefits;
    private List<PayslipLeaveBalance> leaveBalances;
    private Timesheet timesheet;
    private List<TimesheetTransaction> payments;
    private PayslipPayroll payroll;

    public BigDecimal getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(BigDecimal totalPayments) {
        this.totalPayments = totalPayments;
    }

    public BigDecimal getOverpayment() {
        return overpayment;
    }

    public void setOverpayment(BigDecimal overpayment) {
        this.overpayment = overpayment;
    }

    public BigDecimal getTaxCredit() {
        return taxCredit;
    }

    public void setTaxCredit(BigDecimal taxCredit) {
        this.taxCredit = taxCredit;
    }

    public Map<String, String> getYearToDateTotals() {
        return yearToDateTotals;
    }

    public void setYearToDateTotals(Map<String, String> yearToDateTotals) {
        this.yearToDateTotals = yearToDateTotals;
    }

    public BigDecimal getNettPay() {
        return nettPay;
    }

    public void setNettPay(BigDecimal nettPay) {
        this.nettPay = nettPay;
    }

    public String getAbn() {
        return abn;
    }

    public void setAbn(String abn) {
        this.abn = abn;
    }

    public String getPayslipMessage() {
        return payslipMessage;
    }

    public void setPayslipMessage(String payslipMessage) {
        this.payslipMessage = payslipMessage;
    }

    public List<PayslipPayrollEmployeeTransaction> getDeductions() {
        return deductions;
    }

    public void setDeductions(List<PayslipPayrollEmployeeTransaction> deductions) {
        this.deductions = deductions;
    }

    public List<PayslipPayrollEmployeeTransaction> getOtherBenefits() {
        return otherBenefits;
    }

    public void setOtherBenefits(List<PayslipPayrollEmployeeTransaction> otherBenefits) {
        this.otherBenefits = otherBenefits;
    }

    public List<PayslipLeaveBalance> getLeaveBalances() {
        return leaveBalances;
    }

    public void setLeaveBalances(List<PayslipLeaveBalance> leaveBalances) {
        this.leaveBalances = leaveBalances;
    }

    public Timesheet getTimesheet() {
        return timesheet;
    }

    public void setTimesheet(Timesheet timesheet) {
        this.timesheet = timesheet;
    }

    public List<TimesheetTransaction> getPayments() {
        return payments;
    }

    public void setPayments(List<TimesheetTransaction> payments) {
        this.payments = payments;
    }

    public PayslipPayroll getPayroll() {
        return payroll;
    }

    public void setPayroll(PayslipPayroll payroll) {
        this.payroll = payroll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payslip payslip = (Payslip) o;
        return Objects.equals(totalPayments, payslip.totalPayments) &&
                Objects.equals(overpayment, payslip.overpayment) &&
                Objects.equals(taxCredit, payslip.taxCredit) &&
                Objects.equals(yearToDateTotals, payslip.yearToDateTotals) &&
                Objects.equals(nettPay, payslip.nettPay) &&
                Objects.equals(abn, payslip.abn) &&
                Objects.equals(payslipMessage, payslip.payslipMessage) &&
                Objects.equals(deductions, payslip.deductions) &&
                Objects.equals(otherBenefits, payslip.otherBenefits) &&
                Objects.equals(leaveBalances, payslip.leaveBalances) &&
                Objects.equals(timesheet, payslip.timesheet) &&
                Objects.equals(payments, payslip.payments) &&
                Objects.equals(payroll, payslip.payroll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPayments, overpayment, taxCredit, yearToDateTotals, nettPay, abn, payslipMessage, deductions, otherBenefits, leaveBalances, timesheet, payments, payroll);
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "totalPayments=" + totalPayments +
                ", overpayment=" + overpayment +
                ", taxCredit=" + taxCredit +
                ", yearToDateTotals=" + yearToDateTotals +
                ", nettPay=" + nettPay +
                ", abn='" + abn + '\'' +
                ", payslipMessage='" + payslipMessage + '\'' +
                ", deductions=" + deductions +
                ", otherBenefits=" + otherBenefits +
                ", leaveBalances=" + leaveBalances +
                ", timesheet=" + timesheet +
                ", payments=" + payments +
                ", payroll=" + payroll +
                '}';
    }
}
