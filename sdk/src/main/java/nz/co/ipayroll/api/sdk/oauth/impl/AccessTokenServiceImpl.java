package nz.co.ipayroll.api.sdk.oauth.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import nz.co.ipayroll.api.sdk.error.Error;
import nz.co.ipayroll.api.sdk.error.ErrorService;
import nz.co.ipayroll.api.sdk.error.exception.RestClientException;
import nz.co.ipayroll.api.sdk.oauth.AOuthClientConfiguration;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenRepository;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenService;
import nz.co.ipayroll.api.sdk.oauth.vo.AccessToken;
import retrofit2.Call;
import retrofit2.Response;

@Service
public class AccessTokenServiceImpl implements AccessTokenService {

    private static final String GRANT_TYPE = "authorization_code";

    @Autowired
    private AccessTokenRepository accessTokenRepository;

    @Autowired
    private ErrorService errorService;

    @Value("${ipayroll_redirect_uri}")
    private String redirectUrl;
    @Value("${ipayroll_client_id}")
    private String clientId;
    @Value("${ipayroll_client_secret}")
    private String  clientSecret;
    @Value("${ipayroll_server}")
    private String ipayrollServer;

    @Value("${ipayroll_scope}")
    private String scope;
    
    @Override
    public AccessToken getAccessToken(String code) throws RestClientException, IOException {
        Call<AccessToken> call = accessTokenRepository.token(GRANT_TYPE, clientId, clientSecret, code, redirectUrl);
        Response<AccessToken> response = call.execute();
        if(!response.isSuccessful()) {
            Error error = errorService.parseError(response);
            throw new RestClientException(error);
        }
        return response.body();
    }
    
    @Override
    public AOuthClientConfiguration getConfiguration(){
        AOuthClientConfiguration config = new AOuthClientConfiguration();
        config.setBaseUrl(ipayrollServer);
        config.setClientId(clientId);
        config.setRedirectUri(redirectUrl);
        config.setScope(scope);
        return config;
    }
}
