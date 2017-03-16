package nz.co.ipayroll.sdk.oauth;

import nz.co.ipayroll.sdk.oauth.vo.AccessToken;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

// FIXME: 22/11/16 the auth process should only be called once
// FIXME: (e.g. make this interface default to the package and make a service for public use)
@Repository
public interface AccessTokenRepository {

    @POST("token")
    Call<AccessToken> token(
            @Query("grant_type")String grantType,
            @Query("client_id")String clientId,
            @Query("client_secret") String clientSecret,
            @Query("code") String code,
            @Query("redirect_uri") String redirectUri);
}
