package nz.co.ipayroll.api.sdk.payslip.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class PayslipPayrollEmployeeTransaction {

    private BigDecimal amount;
    private BigDecimal quantity;
    private String charity;
    private String description;
    private String notes;
    private String displayPayslipQuantity;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getCharity() {
        return charity;
    }

    public void setCharity(String charity) {
        this.charity = charity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDisplayPayslipQuantity() {
        return displayPayslipQuantity;
    }

    public void setDisplayPayslipQuantity(String displayPayslipQuantity) {
        this.displayPayslipQuantity = displayPayslipQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayslipPayrollEmployeeTransaction that = (PayslipPayrollEmployeeTransaction) o;
        return Objects.equals(amount, that.amount) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(charity, that.charity) &&
                Objects.equals(description, that.description) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(displayPayslipQuantity, that.displayPayslipQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, quantity, charity, description, notes, displayPayslipQuantity);
    }

    @Override
    public String toString() {
        return "PayslipPayrollEmployeeTransaction{" +
                "amount=" + amount +
                ", quantity=" + quantity +
                ", charity='" + charity + '\'' +
                ", description='" + description + '\'' +
                ", notes='" + notes + '\'' +
                ", displayPayslipQuantity='" + displayPayslipQuantity + '\'' +
                '}';
    }
}
