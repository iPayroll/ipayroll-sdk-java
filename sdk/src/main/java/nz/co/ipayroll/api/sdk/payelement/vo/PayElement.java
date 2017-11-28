package nz.co.ipayroll.api.sdk.payelement.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;
import nz.co.ipayroll.api.sdk.employee.vo.LeaveBalanceType;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class PayElement extends ResourceBase {

    private String code;
    private String description;
    private String displayValue;
    private String calculationRule;
    private String group;
    private String type;
    private BigDecimal multiplier;
    private String rateAmount;
    private Boolean expired;
    private Boolean accLevyLiable;
    private Boolean superableEarning;
    private Boolean holidayPayLiable;
    private Boolean notKiwiSaverLiable;
    private Boolean payrollTaxLiable;
    private Boolean rdoLiable;
    private Boolean lslLiable;
    private Boolean casLiable;
    private Boolean reducing;
    private Boolean rayableOnFinalPay;
    private Boolean itemisedOnPaymentSummary;
    private Boolean allowPartialDeduction;
    private Boolean consolidateTransactions;
    private String payeeReference;
    private String payeeCode;
    private String bankAccountNumber;
    private Boolean reduceSuperable;
    private Integer priority;

    private LeaveBalanceType leaveBalanceType;
    private String costCentresRule;
    private String paymentMethod;
    private String payeeParticulars;
    private String doneAddress;
    private String doneeName;
    private Boolean unusedLeavePayment;
    private Boolean employmentTerminationPayment;
    private Boolean employmentTerminationPaymentNoLumpD;
    private Boolean availableForLeaveRequest;
    private String leaveTaxType;
    private String paymentGroup;

    private List<LeaveEntitlementRule> rules;

    private String derivedFrom;
    private String bsbAccountNumber;
    private String calculationAccumulator;
    private String debitCostCentreRule;

    private List<PayElementRate> rates;
    private String excessRedundancy;
    private String customField;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getCalculationRule() {
        return calculationRule;
    }

    public void setCalculationRule(String calculationRule) {
        this.calculationRule = calculationRule;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(BigDecimal multiplier) {
        this.multiplier = multiplier;
    }

    public String getRateAmount() {
        return rateAmount;
    }

    public void setRateAmount(String rateAmount) {
        this.rateAmount = rateAmount;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Boolean getAccLevyLiable() {
        return accLevyLiable;
    }

    public void setAccLevyLiable(Boolean accLevyLiable) {
        this.accLevyLiable = accLevyLiable;
    }

    public Boolean getSuperableEarning() {
        return superableEarning;
    }

    public void setSuperableEarning(Boolean superableEarning) {
        this.superableEarning = superableEarning;
    }

    public Boolean getHolidayPayLiable() {
        return holidayPayLiable;
    }

    public void setHolidayPayLiable(Boolean holidayPayLiable) {
        this.holidayPayLiable = holidayPayLiable;
    }

    public Boolean getNotKiwiSaverLiable() {
        return notKiwiSaverLiable;
    }

    public void setNotKiwiSaverLiable(Boolean notKiwiSaverLiable) {
        this.notKiwiSaverLiable = notKiwiSaverLiable;
    }

    public Boolean getPayrollTaxLiable() {
        return payrollTaxLiable;
    }

    public void setPayrollTaxLiable(Boolean payrollTaxLiable) {
        this.payrollTaxLiable = payrollTaxLiable;
    }

    public Boolean getRdoLiable() {
        return rdoLiable;
    }

    public void setRdoLiable(Boolean rdoLiable) {
        this.rdoLiable = rdoLiable;
    }

    public Boolean getLslLiable() {
        return lslLiable;
    }

    public void setLslLiable(Boolean lslLiable) {
        this.lslLiable = lslLiable;
    }

    public Boolean getCasLiable() {
        return casLiable;
    }

    public void setCasLiable(Boolean casLiable) {
        this.casLiable = casLiable;
    }

    public Boolean getReducing() {
        return reducing;
    }

    public void setReducing(Boolean reducing) {
        this.reducing = reducing;
    }

    public Boolean getRayableOnFinalPay() {
        return rayableOnFinalPay;
    }

    public void setRayableOnFinalPay(Boolean rayableOnFinalPay) {
        this.rayableOnFinalPay = rayableOnFinalPay;
    }

    public Boolean getItemisedOnPaymentSummary() {
        return itemisedOnPaymentSummary;
    }

    public void setItemisedOnPaymentSummary(Boolean itemisedOnPaymentSummary) {
        this.itemisedOnPaymentSummary = itemisedOnPaymentSummary;
    }

    public Boolean getAllowPartialDeduction() {
        return allowPartialDeduction;
    }

    public void setAllowPartialDeduction(Boolean allowPartialDeduction) {
        this.allowPartialDeduction = allowPartialDeduction;
    }

    public Boolean getConsolidateTransactions() {
        return consolidateTransactions;
    }

    public void setConsolidateTransactions(Boolean consolidateTransactions) {
        this.consolidateTransactions = consolidateTransactions;
    }

    public String getPayeeReference() {
        return payeeReference;
    }

    public void setPayeeReference(String payeeReference) {
        this.payeeReference = payeeReference;
    }

    public String getPayeeCode() {
        return payeeCode;
    }

    public void setPayeeCode(String payeeCode) {
        this.payeeCode = payeeCode;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Boolean getReduceSuperable() {
        return reduceSuperable;
    }

    public void setReduceSuperable(Boolean reduceSuperable) {
        this.reduceSuperable = reduceSuperable;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public LeaveBalanceType getLeaveBalanceType() {
        return leaveBalanceType;
    }

    public void setLeaveBalanceType(LeaveBalanceType leaveBalanceType) {
        this.leaveBalanceType = leaveBalanceType;
    }

    public String getCostCentresRule() {
        return costCentresRule;
    }

    public void setCostCentresRule(String costCentresRule) {
        this.costCentresRule = costCentresRule;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPayeeParticulars() {
        return payeeParticulars;
    }

    public void setPayeeParticulars(String payeeParticulars) {
        this.payeeParticulars = payeeParticulars;
    }

    public String getDoneAddress() {
        return doneAddress;
    }

    public void setDoneAddress(String doneAddress) {
        this.doneAddress = doneAddress;
    }

    public String getDoneeName() {
        return doneeName;
    }

    public void setDoneeName(String doneeName) {
        this.doneeName = doneeName;
    }

    public Boolean getUnusedLeavePayment() {
        return unusedLeavePayment;
    }

    public void setUnusedLeavePayment(Boolean unusedLeavePayment) {
        this.unusedLeavePayment = unusedLeavePayment;
    }

    public Boolean getEmploymentTerminationPayment() {
        return employmentTerminationPayment;
    }

    public void setEmploymentTerminationPayment(Boolean employmentTerminationPayment) {
        this.employmentTerminationPayment = employmentTerminationPayment;
    }

    public Boolean getEmploymentTerminationPaymentNoLumpD() {
        return employmentTerminationPaymentNoLumpD;
    }

    public void setEmploymentTerminationPaymentNoLumpD(Boolean employmentTerminationPaymentNoLumpD) {
        this.employmentTerminationPaymentNoLumpD = employmentTerminationPaymentNoLumpD;
    }

    public Boolean getAvailableForLeaveRequest() {
        return availableForLeaveRequest;
    }

    public void setAvailableForLeaveRequest(Boolean availableForLeaveRequest) {
        this.availableForLeaveRequest = availableForLeaveRequest;
    }

    public String getLeaveTaxType() {
        return leaveTaxType;
    }

    public void setLeaveTaxType(String leaveTaxType) {
        this.leaveTaxType = leaveTaxType;
    }

    public String getPaymentGroup() {
        return paymentGroup;
    }

    public void setPaymentGroup(String paymentGroup) {
        this.paymentGroup = paymentGroup;
    }

    public List<LeaveEntitlementRule> getRules() {
        return rules;
    }

    public void setRules(List<LeaveEntitlementRule> rules) {
        this.rules = rules;
    }

    public String getDerivedFrom() {
        return derivedFrom;
    }

    public void setDerivedFrom(String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    public String getBsbAccountNumber() {
        return bsbAccountNumber;
    }

    public void setBsbAccountNumber(String bsbAccountNumber) {
        this.bsbAccountNumber = bsbAccountNumber;
    }

    public String getCalculationAccumulator() {
        return calculationAccumulator;
    }

    public void setCalculationAccumulator(String calculationAccumulator) {
        this.calculationAccumulator = calculationAccumulator;
    }

    public String getDebitCostCentreRule() {
        return debitCostCentreRule;
    }

    public void setDebitCostCentreRule(String debitCostCentreRule) {
        this.debitCostCentreRule = debitCostCentreRule;
    }

    public List<PayElementRate> getRates() {
        return rates;
    }

    public void setRates(List<PayElementRate> rates) {
        this.rates = rates;
    }

    public String getExcessRedundancy() {
        return excessRedundancy;
    }

    public void setExcessRedundancy(String excessRedundancy) {
        this.excessRedundancy = excessRedundancy;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PayElement that = (PayElement) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(description, that.description) &&
                Objects.equals(displayValue, that.displayValue) &&
                Objects.equals(calculationRule, that.calculationRule) &&
                Objects.equals(group, that.group) &&
                Objects.equals(type, that.type) &&
                Objects.equals(multiplier, that.multiplier) &&
                Objects.equals(rateAmount, that.rateAmount) &&
                Objects.equals(expired, that.expired) &&
                Objects.equals(accLevyLiable, that.accLevyLiable) &&
                Objects.equals(superableEarning, that.superableEarning) &&
                Objects.equals(holidayPayLiable, that.holidayPayLiable) &&
                Objects.equals(notKiwiSaverLiable, that.notKiwiSaverLiable) &&
                Objects.equals(payrollTaxLiable, that.payrollTaxLiable) &&
                Objects.equals(rdoLiable, that.rdoLiable) &&
                Objects.equals(lslLiable, that.lslLiable) &&
                Objects.equals(casLiable, that.casLiable) &&
                Objects.equals(reducing, that.reducing) &&
                Objects.equals(rayableOnFinalPay, that.rayableOnFinalPay) &&
                Objects.equals(itemisedOnPaymentSummary, that.itemisedOnPaymentSummary) &&
                Objects.equals(allowPartialDeduction, that.allowPartialDeduction) &&
                Objects.equals(consolidateTransactions, that.consolidateTransactions) &&
                Objects.equals(payeeReference, that.payeeReference) &&
                Objects.equals(payeeCode, that.payeeCode) &&
                Objects.equals(bankAccountNumber, that.bankAccountNumber) &&
                Objects.equals(reduceSuperable, that.reduceSuperable) &&
                Objects.equals(priority, that.priority) &&
                Objects.equals(leaveBalanceType, that.leaveBalanceType) &&
                Objects.equals(costCentresRule, that.costCentresRule) &&
                Objects.equals(paymentMethod, that.paymentMethod) &&
                Objects.equals(payeeParticulars, that.payeeParticulars) &&
                Objects.equals(doneAddress, that.doneAddress) &&
                Objects.equals(doneeName, that.doneeName) &&
                Objects.equals(unusedLeavePayment, that.unusedLeavePayment) &&
                Objects.equals(employmentTerminationPayment, that.employmentTerminationPayment) &&
                Objects.equals(employmentTerminationPaymentNoLumpD, that.employmentTerminationPaymentNoLumpD) &&
                Objects.equals(availableForLeaveRequest, that.availableForLeaveRequest) &&
                Objects.equals(leaveTaxType, that.leaveTaxType) &&
                Objects.equals(paymentGroup, that.paymentGroup) &&
                Objects.equals(rules, that.rules) &&
                Objects.equals(derivedFrom, that.derivedFrom) &&
                Objects.equals(bsbAccountNumber, that.bsbAccountNumber) &&
                Objects.equals(calculationAccumulator, that.calculationAccumulator) &&
                Objects.equals(debitCostCentreRule, that.debitCostCentreRule) &&
                Objects.equals(rates, that.rates) &&
                Objects.equals(excessRedundancy, that.excessRedundancy) &&
                Objects.equals(customField, that.customField);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), code, description, displayValue, calculationRule, group, type, multiplier, rateAmount, expired, accLevyLiable, superableEarning, holidayPayLiable, notKiwiSaverLiable, payrollTaxLiable, rdoLiable, lslLiable, casLiable, reducing, rayableOnFinalPay, itemisedOnPaymentSummary, allowPartialDeduction, consolidateTransactions, payeeReference, payeeCode, bankAccountNumber, reduceSuperable, priority, leaveBalanceType, costCentresRule, paymentMethod, payeeParticulars, doneAddress, doneeName, unusedLeavePayment, employmentTerminationPayment, employmentTerminationPaymentNoLumpD, availableForLeaveRequest, leaveTaxType, paymentGroup, rules, derivedFrom, bsbAccountNumber, calculationAccumulator, debitCostCentreRule, rates, excessRedundancy, customField);
    }

    @Override
    public String toString() {
        return "PayElement{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", displayValue='" + displayValue + '\'' +
                ", calculationRule='" + calculationRule + '\'' +
                ", group='" + group + '\'' +
                ", type='" + type + '\'' +
                ", multiplier=" + multiplier +
                ", rateAmount='" + rateAmount + '\'' +
                ", expired=" + expired +
                ", accLevyLiable=" + accLevyLiable +
                ", superableEarning=" + superableEarning +
                ", holidayPayLiable=" + holidayPayLiable +
                ", notKiwiSaverLiable=" + notKiwiSaverLiable +
                ", payrollTaxLiable=" + payrollTaxLiable +
                ", rdoLiable=" + rdoLiable +
                ", lslLiable=" + lslLiable +
                ", casLiable=" + casLiable +
                ", reducing=" + reducing +
                ", rayableOnFinalPay=" + rayableOnFinalPay +
                ", itemisedOnPaymentSummary=" + itemisedOnPaymentSummary +
                ", allowPartialDeduction=" + allowPartialDeduction +
                ", consolidateTransactions=" + consolidateTransactions +
                ", payeeReference='" + payeeReference + '\'' +
                ", payeeCode='" + payeeCode + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", reduceSuperable=" + reduceSuperable +
                ", priority=" + priority +
                ", leaveBalanceType=" + leaveBalanceType +
                ", costCentresRule='" + costCentresRule + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", payeeParticulars='" + payeeParticulars + '\'' +
                ", doneAddress='" + doneAddress + '\'' +
                ", doneeName='" + doneeName + '\'' +
                ", unusedLeavePayment=" + unusedLeavePayment +
                ", employmentTerminationPayment=" + employmentTerminationPayment +
                ", employmentTerminationPaymentNoLumpD=" + employmentTerminationPaymentNoLumpD +
                ", availableForLeaveRequest=" + availableForLeaveRequest +
                ", leaveTaxType='" + leaveTaxType + '\'' +
                ", paymentGroup='" + paymentGroup + '\'' +
                ", rules=" + rules +
                ", derivedFrom='" + derivedFrom + '\'' +
                ", bsbAccountNumber='" + bsbAccountNumber + '\'' +
                ", calculationAccumulator='" + calculationAccumulator + '\'' +
                ", debitCostCentreRule='" + debitCostCentreRule + '\'' +
                ", rates=" + rates +
                ", excessRedundancy='" + excessRedundancy + '\'' +
                ", customField='" + customField + '\'' +
                "} " + super.toString();
    }
}
