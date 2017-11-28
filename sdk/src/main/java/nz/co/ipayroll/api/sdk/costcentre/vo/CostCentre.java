package nz.co.ipayroll.api.sdk.costcentre.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CostCentre extends ResourceSupport {

    private String code;
    private String description;
    private String displayValue;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CostCentre that = (CostCentre) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(description, that.description) &&
                Objects.equals(displayValue, that.displayValue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), code, description, displayValue);
    }

    @Override
    public String toString() {
        return "CostCentre{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", displayValue='" + displayValue + '\'' +
                "} " + super.toString();
    }
}
