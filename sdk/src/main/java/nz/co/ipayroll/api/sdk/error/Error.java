package nz.co.ipayroll.api.sdk.error;

import com.google.gson.annotations.SerializedName;

public class Error {

    @SerializedName("error")
    protected String error;
    
    @SerializedName("error_description")
    protected String errorDescription;
    
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    
    public String getErrorDescription() {
        return errorDescription;
    }
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
    
}
