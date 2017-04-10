package nz.co.ipayroll.api.sdk.oauth;

public class AOuthClientConfiguration {

    private String baseUrl;
    private String clientId;
    private String redirectUri;
    
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    
    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String ipayrollRedirectUri) {
        this.redirectUri = ipayrollRedirectUri;
    }

    public String getAuthorizeUrl() {
        return baseUrl+"/oauth/authorize?response_type=code&client_id="+clientId+"&scope=employees%20leavebalances%20costcentres%20timesheets&redirect_uri="+redirectUri;             
    }
    
}
