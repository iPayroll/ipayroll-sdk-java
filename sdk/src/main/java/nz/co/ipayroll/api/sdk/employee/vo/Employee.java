package nz.co.ipayroll.api.sdk.employee.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Employee extends ResourceBase {

    private String surname;
    private String firstNames;
    private String startDate;
    private String birthDate;
    private String paidToDate;
    private String defaultCostCentre;
    private String email;
    private String phone;
    private String title;
    private String workState;
    private String gender;
    private String payFrequency;
    private BigDecimal fullTimeHoursWeek;
    private Integer organisation;
    private Address address;
    private String paymentMethod;
    private String bankAccountNumber;
    private String taxNumber;
    private String finishDate;
    private String terminationReason;
    private String taxCode;
    private String taxScale;
    private String kiwiSaverRate;
    private String employerSubsidy;
    private String kiwiSaverOptOutDate;
    private String existingKiwiSaverMember;
    private String deathBenefitSurname;
    private String deathBenefitFirstName;
    private String deathBenefitRecipient;
    private String esctRate;
    private String specialTax;
    private String specialEarnerLevy;
    private String specialExtraPayRate;
    private String specialStudentLoan;
    private String userDefinedGroup;
    private String isHelpDebt;
    private String isMedicareLevyVariationDeclaration;
    private String isHasSpouse;
    private String isIncomeLessThanRelevantAmount;
    private String isPayrollTaxExempt;
    private String isSfssDebt;
    private String dependentChildren;
    private String surchargeIncrease;
    private String preferredName;
    private String proprietorStatus;
    private String contractorsAbn;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPaidToDate() {
        return paidToDate;
    }

    public void setPaidToDate(String paidToDate) {
        this.paidToDate = paidToDate;
    }

    public String getDefaultCostCentre() {
        return defaultCostCentre;
    }

    public void setDefaultCostCentre(String defaultCostCentre) {
        this.defaultCostCentre = defaultCostCentre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(String payFrequency) {
        this.payFrequency = payFrequency;
    }

    public BigDecimal getFullTimeHoursWeek() {
        return fullTimeHoursWeek;
    }

    public void setFullTimeHoursWeek(BigDecimal fullTimeHoursWeek) {
        this.fullTimeHoursWeek = fullTimeHoursWeek;
    }

    public Integer getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Integer organisation) {
        this.organisation = organisation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getTerminationReason() {
        return terminationReason;
    }

    public void setTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxScale() {
        return taxScale;
    }

    public void setTaxScale(String taxScale) {
        this.taxScale = taxScale;
    }

    public String getKiwiSaverRate() {
        return kiwiSaverRate;
    }

    public void setKiwiSaverRate(String kiwiSaverRate) {
        this.kiwiSaverRate = kiwiSaverRate;
    }

    public String getEmployerSubsidy() {
        return employerSubsidy;
    }

    public void setEmployerSubsidy(String employerSubsidy) {
        this.employerSubsidy = employerSubsidy;
    }

    public String getKiwiSaverOptOutDate() {
        return kiwiSaverOptOutDate;
    }

    public void setKiwiSaverOptOutDate(String kiwiSaverOptOutDate) {
        this.kiwiSaverOptOutDate = kiwiSaverOptOutDate;
    }

    public String getExistingKiwiSaverMember() {
        return existingKiwiSaverMember;
    }

    public void setExistingKiwiSaverMember(String existingKiwiSaverMember) {
        this.existingKiwiSaverMember = existingKiwiSaverMember;
    }

    public String getDeathBenefitSurname() {
        return deathBenefitSurname;
    }

    public void setDeathBenefitSurname(String deathBenefitSurname) {
        this.deathBenefitSurname = deathBenefitSurname;
    }

    public String getDeathBenefitFirstName() {
        return deathBenefitFirstName;
    }

    public void setDeathBenefitFirstName(String deathBenefitFirstName) {
        this.deathBenefitFirstName = deathBenefitFirstName;
    }

    public String getDeathBenefitRecipient() {
        return deathBenefitRecipient;
    }

    public void setDeathBenefitRecipient(String deathBenefitRecipient) {
        this.deathBenefitRecipient = deathBenefitRecipient;
    }

    public String getEsctRate() {
        return esctRate;
    }

    public void setEsctRate(String esctRate) {
        this.esctRate = esctRate;
    }

    public String getSpecialTax() {
        return specialTax;
    }

    public void setSpecialTax(String specialTax) {
        this.specialTax = specialTax;
    }

    public String getSpecialEarnerLevy() {
        return specialEarnerLevy;
    }

    public void setSpecialEarnerLevy(String specialEarnerLevy) {
        this.specialEarnerLevy = specialEarnerLevy;
    }

    public String getSpecialExtraPayRate() {
        return specialExtraPayRate;
    }

    public void setSpecialExtraPayRate(String specialExtraPayRate) {
        this.specialExtraPayRate = specialExtraPayRate;
    }

    public String getSpecialStudentLoan() {
        return specialStudentLoan;
    }

    public void setSpecialStudentLoan(String specialStudentLoan) {
        this.specialStudentLoan = specialStudentLoan;
    }

    public String getUserDefinedGroup() {
        return userDefinedGroup;
    }

    public void setUserDefinedGroup(String userDefinedGroup) {
        this.userDefinedGroup = userDefinedGroup;
    }

    public String getIsHelpDebt() {
        return isHelpDebt;
    }

    public void setIsHelpDebt(String isHelpDebt) {
        this.isHelpDebt = isHelpDebt;
    }

    public String getIsMedicareLevyVariationDeclaration() {
        return isMedicareLevyVariationDeclaration;
    }

    public void setIsMedicareLevyVariationDeclaration(String isMedicareLevyVariationDeclaration) {
        this.isMedicareLevyVariationDeclaration = isMedicareLevyVariationDeclaration;
    }

    public String getIsHasSpouse() {
        return isHasSpouse;
    }

    public void setIsHasSpouse(String isHasSpouse) {
        this.isHasSpouse = isHasSpouse;
    }

    public String getIsIncomeLessThanRelevantAmount() {
        return isIncomeLessThanRelevantAmount;
    }

    public void setIsIncomeLessThanRelevantAmount(String isIncomeLessThanRelevantAmount) {
        this.isIncomeLessThanRelevantAmount = isIncomeLessThanRelevantAmount;
    }

    public String getIsPayrollTaxExempt() {
        return isPayrollTaxExempt;
    }

    public void setIsPayrollTaxExempt(String isPayrollTaxExempt) {
        this.isPayrollTaxExempt = isPayrollTaxExempt;
    }

    public String getIsSfssDebt() {
        return isSfssDebt;
    }

    public void setIsSfssDebt(String isSfssDebt) {
        this.isSfssDebt = isSfssDebt;
    }

    public String getDependentChildren() {
        return dependentChildren;
    }

    public void setDependentChildren(String dependentChildren) {
        this.dependentChildren = dependentChildren;
    }

    public String getSurchargeIncrease() {
        return surchargeIncrease;
    }

    public void setSurchargeIncrease(String surchargeIncrease) {
        this.surchargeIncrease = surchargeIncrease;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getProprietorStatus() {
        return proprietorStatus;
    }

    public void setProprietorStatus(String proprietorStatus) {
        this.proprietorStatus = proprietorStatus;
    }

    public String getContractorsAbn() {
        return contractorsAbn;
    }

    public void setContractorsAbn(String contractorsAbn) {
        this.contractorsAbn = contractorsAbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(surname, employee.surname) &&
                Objects.equals(firstNames, employee.firstNames) &&
                Objects.equals(startDate, employee.startDate) &&
                Objects.equals(birthDate, employee.birthDate) &&
                Objects.equals(paidToDate, employee.paidToDate) &&
                Objects.equals(defaultCostCentre, employee.defaultCostCentre) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(phone, employee.phone) &&
                Objects.equals(title, employee.title) &&
                Objects.equals(workState, employee.workState) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(payFrequency, employee.payFrequency) &&
                Objects.equals(fullTimeHoursWeek, employee.fullTimeHoursWeek) &&
                Objects.equals(organisation, employee.organisation) &&
                Objects.equals(address, employee.address) &&
                Objects.equals(paymentMethod, employee.paymentMethod) &&
                Objects.equals(bankAccountNumber, employee.bankAccountNumber) &&
                Objects.equals(taxNumber, employee.taxNumber) &&
                Objects.equals(finishDate, employee.finishDate) &&
                Objects.equals(terminationReason, employee.terminationReason) &&
                Objects.equals(taxCode, employee.taxCode) &&
                Objects.equals(taxScale, employee.taxScale) &&
                Objects.equals(kiwiSaverRate, employee.kiwiSaverRate) &&
                Objects.equals(employerSubsidy, employee.employerSubsidy) &&
                Objects.equals(kiwiSaverOptOutDate, employee.kiwiSaverOptOutDate) &&
                Objects.equals(existingKiwiSaverMember, employee.existingKiwiSaverMember) &&
                Objects.equals(deathBenefitSurname, employee.deathBenefitSurname) &&
                Objects.equals(deathBenefitFirstName, employee.deathBenefitFirstName) &&
                Objects.equals(deathBenefitRecipient, employee.deathBenefitRecipient) &&
                Objects.equals(esctRate, employee.esctRate) &&
                Objects.equals(specialTax, employee.specialTax) &&
                Objects.equals(specialEarnerLevy, employee.specialEarnerLevy) &&
                Objects.equals(specialExtraPayRate, employee.specialExtraPayRate) &&
                Objects.equals(specialStudentLoan, employee.specialStudentLoan) &&
                Objects.equals(userDefinedGroup, employee.userDefinedGroup) &&
                Objects.equals(isHelpDebt, employee.isHelpDebt) &&
                Objects.equals(isMedicareLevyVariationDeclaration, employee.isMedicareLevyVariationDeclaration) &&
                Objects.equals(isHasSpouse, employee.isHasSpouse) &&
                Objects.equals(isIncomeLessThanRelevantAmount, employee.isIncomeLessThanRelevantAmount) &&
                Objects.equals(isPayrollTaxExempt, employee.isPayrollTaxExempt) &&
                Objects.equals(isSfssDebt, employee.isSfssDebt) &&
                Objects.equals(dependentChildren, employee.dependentChildren) &&
                Objects.equals(surchargeIncrease, employee.surchargeIncrease) &&
                Objects.equals(preferredName, employee.preferredName) &&
                Objects.equals(proprietorStatus, employee.proprietorStatus) &&
                Objects.equals(contractorsAbn, employee.contractorsAbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), surname, firstNames, startDate, birthDate, paidToDate, defaultCostCentre,
                email, phone, title, workState, gender, payFrequency, fullTimeHoursWeek, organisation, address,
                paymentMethod, bankAccountNumber, taxNumber, finishDate, terminationReason, taxCode, taxScale,
                kiwiSaverRate, employerSubsidy, kiwiSaverOptOutDate, existingKiwiSaverMember, deathBenefitSurname,
                deathBenefitFirstName, deathBenefitRecipient, esctRate, specialTax, specialEarnerLevy,
                specialExtraPayRate, specialStudentLoan, userDefinedGroup, isHelpDebt,
                isMedicareLevyVariationDeclaration, isHasSpouse, isIncomeLessThanRelevantAmount, isPayrollTaxExempt,
                isSfssDebt, dependentChildren, surchargeIncrease, preferredName, proprietorStatus, contractorsAbn);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", firstNames='" + firstNames + '\'' +
                ", startDate='" + startDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", paidToDate='" + paidToDate + '\'' +
                ", defaultCostCentre='" + defaultCostCentre + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", title='" + title + '\'' +
                ", workState='" + workState + '\'' +
                ", gender='" + gender + '\'' +
                ", payFrequency='" + payFrequency + '\'' +
                ", fullTimeHoursWeek=" + fullTimeHoursWeek +
                ", organisation=" + organisation +
                ", address=" + address +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", finishDate='" + finishDate + '\'' +
                ", terminationReason='" + terminationReason + '\'' +
                ", taxCode='" + taxCode + '\'' +
                ", taxScale='" + taxScale + '\'' +
                ", kiwiSaverRate='" + kiwiSaverRate + '\'' +
                ", employerSubsidy='" + employerSubsidy + '\'' +
                ", kiwiSaverOptOutDate='" + kiwiSaverOptOutDate + '\'' +
                ", existingKiwiSaverMember='" + existingKiwiSaverMember + '\'' +
                ", deathBenefitSurname='" + deathBenefitSurname + '\'' +
                ", deathBenefitFirstName='" + deathBenefitFirstName + '\'' +
                ", deathBenefitRecipient='" + deathBenefitRecipient + '\'' +
                ", esctRate='" + esctRate + '\'' +
                ", specialTax='" + specialTax + '\'' +
                ", specialEarnerLevy='" + specialEarnerLevy + '\'' +
                ", specialExtraPayRate='" + specialExtraPayRate + '\'' +
                ", specialStudentLoan='" + specialStudentLoan + '\'' +
                ", userDefinedGroup='" + userDefinedGroup + '\'' +
                ", isHelpDebt='" + isHelpDebt + '\'' +
                ", isMedicareLevyVariationDeclaration='" + isMedicareLevyVariationDeclaration + '\'' +
                ", isHasSpouse='" + isHasSpouse + '\'' +
                ", isIncomeLessThanRelevantAmount='" + isIncomeLessThanRelevantAmount + '\'' +
                ", isPayrollTaxExempt='" + isPayrollTaxExempt + '\'' +
                ", isSfssDebt='" + isSfssDebt + '\'' +
                ", dependentChildren='" + dependentChildren + '\'' +
                ", surchargeIncrease='" + surchargeIncrease + '\'' +
                ", preferredName='" + preferredName + '\'' +
                ", proprietorStatus='" + proprietorStatus + '\'' +
                ", contractorsAbn='" + contractorsAbn + '\'' +
                "} " + super.toString();
    }
}
