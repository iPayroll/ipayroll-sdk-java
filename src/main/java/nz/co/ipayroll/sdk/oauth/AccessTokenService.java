package nz.co.ipayroll.sdk.oauth;

import nz.co.ipayroll.sdk.oauth.vo.AccessToken;

import java.io.IOException;

public interface AccessTokenService {

    AccessToken getAccessToken(String code) throws IOException;
}
