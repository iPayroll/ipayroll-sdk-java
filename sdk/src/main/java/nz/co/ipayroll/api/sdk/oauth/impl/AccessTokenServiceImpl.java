package nz.co.ipayroll.api.sdk.oauth.impl;

import java.io.IOException;

import nz.co.ipayroll.api.sdk.error.exception.ClientException;
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
import okhttp3.HttpUrl;
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
    private String clientSecret;
    @Value("${ipayroll_server}")
    private String ipayrollServer;

    @Value("${ipayroll_scope}")
    private String scope;

    @Override
    public AccessToken getAccessToken(String code) throws RestClientException {
        Call<AccessToken> call = accessTokenRepository.token(GRANT_TYPE, clientId, clientSecret, code, redirectUrl);

        Response<AccessToken> response = checkError(call);
        
        String method = response.raw().request().method();
        String url = response.raw().request().url().toString();
        int responseCode = response.code();
        
        String headers = response.raw().request().headers().toString();
        AccessToken accessToken = response.body();
        
        System.out.println("***** Request *****");
        System.out.println(method + " " + url);
        System.out.println(headers);

        System.out.println("***** Response *****");
        System.out.println("Code: " + responseCode);
        System.out.println(accessToken);
        return accessToken;
    }

    @Override
    public AccessToken refreshAccessToken(AccessToken accessToken) {
        return refreshAccessToken(accessToken.getRefreshToken());
    }

    @Override
    public AccessToken refreshAccessToken(String refreshToken) {
        Call<AccessToken> call = accessTokenRepository.refreshToken("refresh_token", clientId, clientSecret, scope, refreshToken);
        Response<AccessToken> response = checkError(call);
        return response.body();
    }


    private Response<AccessToken> checkError(Call<AccessToken> call) {
        try {
            Response<AccessToken> response = call.execute();
            if (!response.isSuccessful()) {
                Error error = errorService.parseError(response);
                throw new RestClientException(error);
            }
            return response;
        } catch (IOException e) {
            throw new ClientException(e);
        }
    }


    @Override
    public AOuthClientConfiguration getConfiguration() {
        AOuthClientConfiguration config = new AOuthClientConfiguration();
        config.setBaseUrl(ipayrollServer);
        config.setClientId(clientId);
        config.setRedirectUri(redirectUrl);
        config.setScope(scope);
        return config;
    }
}
