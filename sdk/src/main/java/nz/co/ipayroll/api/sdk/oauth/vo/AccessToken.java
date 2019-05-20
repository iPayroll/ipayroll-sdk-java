package nz.co.ipayroll.api.sdk.oauth.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessToken implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Indicates whether this access token should be logged or not.
     * Logging the access token is sometimes useful for example during customer support. 
     */
    private boolean logAccessToken = true;
    
    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("expires_in")
    private long expiresIn;

    @SerializedName("refresh_token")
    private String refreshToken;

    private String scope;

    private String error;

    @SerializedName("error_description")
    private String errorDescription;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

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

    public String token() {
        return this.tokenType + " " + this.accessToken.trim();
    }
    
    public String toString() {
    	StringBuilder builder = new StringBuilder();
    	
    	// Access Token
    	builder.append("--------------------------------------------------------------------");
    	builder.append(System.lineSeparator());
    	builder.append("Access token: ");
    	if (accessToken != null && logAccessToken == false) { 
    		builder.append("< valid access token masked for security reasons >");
    	} else if (accessToken != null && logAccessToken == true) {
    		builder.append(accessToken);
    	} else { 
    		builder.append("null");
    	}
    	builder.append(System.lineSeparator());
    	
    	// Refresh token
    	
    	builder.append("Refresh token: ");
    	if (refreshToken == null) { 
    		builder.append("null");
    	} else if (refreshToken != null && logAccessToken == false) {
    		builder.append("<valid refresh token mased for security reasons> ");
    	} else { 
    		builder.append(refreshToken);
    	}
    	
    	// Token type
    	
    	builder.append(System.lineSeparator());
    	builder.append("Token type: ");
    	builder.append(tokenType);
    	builder.append(System.lineSeparator());
    	
    	// Expires in
    	
    	builder.append("Expires in: ");
    	builder.append(expiresIn);
    	builder.append(System.lineSeparator());
    	
    	// Scopes
    	
    	builder.append("Scopes: ");
    	builder.append(scope);
    	builder.append(System.lineSeparator());
    	
    	// Error
    	builder.append("Error: ");
    	builder.append(error);
    	builder.append(System.lineSeparator());
    	
    	// Error description
    	builder.append("Error description: ");
    	builder.append(errorDescription);
    	builder.append(System.lineSeparator());
    	builder.append("--------------------------------------------------------------------");
		return builder.toString(); 
    	
    }
}
