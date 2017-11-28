package nz.co.ipayroll.api.sdk.oauth;

import nz.co.ipayroll.api.sdk.oauth.vo.AccessToken;

import java.io.IOException;

public interface AccessTokenService {

    AccessToken getAccessToken(String code) throws IOException;

    AccessToken refreshAccessToken(AccessToken accessToken);

    AccessToken refreshAccessToken(String refreshToken);

    AOuthClientConfiguration getConfiguration();
}
