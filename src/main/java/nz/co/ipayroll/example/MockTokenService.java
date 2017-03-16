package nz.co.ipayroll.example;

import nz.co.ipayroll.sdk.oauth.vo.AccessToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MockTokenService {
    @Value("${access_token}")
    private String accessToken;

    public AccessToken getAccessToken() {
        AccessToken token = new AccessToken();
        token.setTokenType("Bearer");
        token.setAccessToken(accessToken);
        return token;
    }
}
