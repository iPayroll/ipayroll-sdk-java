package nz.co.ipayroll.api.sdk.oauth.impl;

import nz.co.ipayroll.api.sdk.oauth.vo.AccessToken;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenRepository;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import retrofit2.Call;

import java.io.IOException;

@Service
public class AccessTokenServiceImpl implements AccessTokenService {
    private static final Logger logger = LoggerFactory.getLogger(AccessTokenServiceImpl.class);

    @Autowired
    private AccessTokenRepository accessTokenRepository;

    @Value("${ipayroll_redirect_uri}")
    private String redirectUrl;
    @Value("${ipayroll_client_id}")
    private String clientId;
    @Value("${ipayroll_client_secret}")
    private String  clientSecret;
    @Value("${ipayroll_grant_type}")
    private String grantType;

    @Override
    public AccessToken getAccessToken(String code) throws IOException {
        Call<AccessToken> call = accessTokenRepository.token(grantType, clientId, clientSecret, code, redirectUrl);

        return call.execute().body();
    }
}
