package nz.co.ipayroll.api.sdk.costcentre.vo;

import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;

public class CostCentre extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long costCentreId;
    private String code;
    private String description;
    private String displayValue;

    public Long getCostCentreId() {
        return costCentreId;
    }

    public void setCostCentreId(Long costCentreId) {
        this.costCentreId = costCentreId;
    }

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
}
