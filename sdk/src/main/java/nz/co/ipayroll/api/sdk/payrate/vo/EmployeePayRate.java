package nz.co.ipayroll.api.sdk.payrate.vo;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.math.BigDecimal;

public class EmployeePayRate extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal hourlyRate;
    private BigDecimal annualRate;
    private BigDecimal rate;
    private String code;
    private String divisor;

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
}
