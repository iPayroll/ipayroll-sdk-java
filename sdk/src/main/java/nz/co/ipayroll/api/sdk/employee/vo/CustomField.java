package nz.co.ipayroll.api.sdk.employee.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;

import java.util.Objects;

public class CustomField extends ResourceBase {

    public Integer category;
    public String categoryName;
    public Integer customFieldId;
    public String name;
    public String date;
    public String description;
    public String contact;
    public String relationship;
    public String phoneNumber;
    public String email;
    public String address;
    public String hayPoints;
    public String haysProfile;
    public String fte;
    public String finish;
    public String start;
    public String reportsTo;
    public String reportsFrom;
    public Double contractHours;
    public Double periodDays;
    public String contractEnd;
    public String renumerationType;
    public String annualBenefit;
    public String award;

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHayPoints() {
        return hayPoints;
    }

    public void setHayPoints(String hayPoints) {
        this.hayPoints = hayPoints;
    }

    public String getHaysProfile() {
        return haysProfile;
    }

    public void setHaysProfile(String haysProfile) {
        this.haysProfile = haysProfile;
    }

    public String getFte() {
        return fte;
    }

    public void setFte(String fte) {
        this.fte = fte;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getReportsFrom() {
        return reportsFrom;
    }

    public void setReportsFrom(String reportsFrom) {
        this.reportsFrom = reportsFrom;
    }

    public Double getContractHours() {
        return contractHours;
    }

    public void setContractHours(Double contractHours) {
        this.contractHours = contractHours;
    }

    public Double getPeriodDays() {
        return periodDays;
    }

    public void setPeriodDays(Double periodDays) {
        this.periodDays = periodDays;
    }

    public String getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(String contractEnd) {
        this.contractEnd = contractEnd;
    }

    public String getRenumerationType() {
        return renumerationType;
    }

    public void setRenumerationType(String renumerationType) {
        this.renumerationType = renumerationType;
    }

    public String getAnnualBenefit() {
        return annualBenefit;
    }

    public void setAnnualBenefit(String annualBenefit) {
        this.annualBenefit = annualBenefit;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomField that = (CustomField) o;
        return Objects.equals(category, that.category) &&
                Objects.equals(categoryName, that.categoryName) &&
                Objects.equals(customFieldId, that.customFieldId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(date, that.date) &&
                Objects.equals(description, that.description) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(relationship, that.relationship) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(email, that.email) &&
                Objects.equals(address, that.address) &&
                Objects.equals(hayPoints, that.hayPoints) &&
                Objects.equals(haysProfile, that.haysProfile) &&
                Objects.equals(fte, that.fte) &&
                Objects.equals(finish, that.finish) &&
                Objects.equals(start, that.start) &&
                Objects.equals(reportsTo, that.reportsTo) &&
                Objects.equals(reportsFrom, that.reportsFrom) &&
                Objects.equals(contractHours, that.contractHours) &&
                Objects.equals(periodDays, that.periodDays) &&
                Objects.equals(contractEnd, that.contractEnd) &&
                Objects.equals(renumerationType, that.renumerationType) &&
                Objects.equals(annualBenefit, that.annualBenefit) &&
                Objects.equals(award, that.award);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), category, categoryName, customFieldId, name, date, description, contact, relationship, phoneNumber, email, address, hayPoints, haysProfile, fte, finish, start, reportsTo, reportsFrom, contractHours, periodDays, contractEnd, renumerationType, annualBenefit, award);
    }

    @Override
    public String toString() {
        return "CustomField{" +
                "category=" + category +
                ", categoryName='" + categoryName + '\'' +
                ", customFieldId=" + customFieldId +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", contact='" + contact + '\'' +
                ", relationship='" + relationship + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", hayPoints='" + hayPoints + '\'' +
                ", haysProfile='" + haysProfile + '\'' +
                ", fte='" + fte + '\'' +
                ", finish='" + finish + '\'' +
                ", start='" + start + '\'' +
                ", reportsTo='" + reportsTo + '\'' +
                ", reportsFrom='" + reportsFrom + '\'' +
                ", contractHours=" + contractHours +
                ", periodDays=" + periodDays +
                ", contractEnd='" + contractEnd + '\'' +
                ", renumerationType='" + renumerationType + '\'' +
                ", annualBenefit='" + annualBenefit + '\'' +
                ", award='" + award + '\'' +
                "} " + super.toString();
    }
}
