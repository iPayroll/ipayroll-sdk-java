package nz.co.ipayroll.api.sdk.payelement.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class PayElementRate {

    private String reportingGroupName;
    private String description;
    private BigDecimal rate;
    private BigDecimal years;
    private BigDecimal taxablePayPerWeek;
    private BigDecimal hoursPerWeek;
    private BigDecimal multiplier;

    public String getReportingGroupName() {
        return reportingGroupName;
    }

    public void setReportingGroupName(String reportingGroupName) {
        this.reportingGroupName = reportingGroupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getYears() {
        return years;
    }

    public void setYears(BigDecimal years) {
        this.years = years;
    }

    public BigDecimal getTaxablePayPerWeek() {
        return taxablePayPerWeek;
    }

    public void setTaxablePayPerWeek(BigDecimal taxablePayPerWeek) {
        this.taxablePayPerWeek = taxablePayPerWeek;
    }

    public BigDecimal getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(BigDecimal hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public BigDecimal getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(BigDecimal multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayElementRate that = (PayElementRate) o;
        return Objects.equals(reportingGroupName, that.reportingGroupName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(years, that.years) &&
                Objects.equals(taxablePayPerWeek, that.taxablePayPerWeek) &&
                Objects.equals(hoursPerWeek, that.hoursPerWeek) &&
                Objects.equals(multiplier, that.multiplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportingGroupName, description, rate, years, taxablePayPerWeek, hoursPerWeek, multiplier);
    }

    @Override
    public String toString() {
        return "PayElementRate{" +
                "reportingGroupName='" + reportingGroupName + '\'' +
                ", description='" + description + '\'' +
                ", rate=" + rate +
                ", years=" + years +
                ", taxablePayPerWeek=" + taxablePayPerWeek +
                ", hoursPerWeek=" + hoursPerWeek +
                ", multiplier=" + multiplier +
                '}';
    }
}
