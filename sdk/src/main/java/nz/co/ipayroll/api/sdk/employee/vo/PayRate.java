package nz.co.ipayroll.api.sdk.employee.vo;

import nz.co.ipayroll.api.sdk.base.ResourceBase;

import java.math.BigDecimal;
import java.util.Objects;

public class PayRate extends ResourceBase {

    private BigDecimal hourlyRate;
    private BigDecimal annualRate;
    private BigDecimal rate;
    private String code;
    private String divisor;
    private String payScaleCode;

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(BigDecimal annualRate) {
        this.annualRate = annualRate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDivisor() {
        return divisor;
    }

    public void setDivisor(String divisor) {
        this.divisor = divisor;
    }

    public String getPayScaleCode() {
        return payScaleCode;
    }

    public void setPayScaleCode(String payScaleCode) {
        this.payScaleCode = payScaleCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PayRate payRate = (PayRate) o;
        return Objects.equals(hourlyRate, payRate.hourlyRate) &&
                Objects.equals(annualRate, payRate.annualRate) &&
                Objects.equals(rate, payRate.rate) &&
                Objects.equals(code, payRate.code) &&
                Objects.equals(divisor, payRate.divisor) &&
                Objects.equals(payScaleCode, payRate.payScaleCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), hourlyRate, annualRate, rate, code, divisor, payScaleCode);
    }

    @Override
    public String toString() {
        return "PayRate{" +
                "hourlyRate=" + hourlyRate +
                ", annualRate=" + annualRate +
                ", rate=" + rate +
                ", code='" + code + '\'' +
                ", divisor='" + divisor + '\'' +
                ", payScaleCode='" + payScaleCode + '\'' +
                "} " + super.toString();
    }
}
