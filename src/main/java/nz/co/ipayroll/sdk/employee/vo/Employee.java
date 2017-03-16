package nz.co.ipayroll.sdk.employee.vo;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee extends ResourceSupport implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String surname;
    private String firstNames;
    private String employeeId;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    @Override
    public String toString() {
        return "Employee{" + "surname='" + surname + '\'' + ", firstNames='" + firstNames + '\'' + ", employeeId='" + employeeId
                + '\'' + ", address='" + address + '\'' + ", startDate=" + startDate + ", birthDate=" + birthDate + ", paidToDate="
                + paidToDate + ", defaultCostCentre='" + defaultCostCentre + '\'' + ", email='" + email + '\'' + ", phone='" + phone + '\''
                + ", title='" + title + '\'' + ", state='" + workState + '\'' + ", gender='" + gender + '\'' + ", payFrequency='" + payFrequency
                + '\'' + ", fullTimeHoursWeek=" + fullTimeHoursWeek + ", organisation=" + organisation + '}';
    }

}
