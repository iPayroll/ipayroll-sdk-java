package nz.co.ipayroll.api.sdk.payelement;

import nz.co.ipayroll.api.sdk.payelement.vo.PayElement;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.*;

@Repository
public interface PayElementRepository {

    @GET("payelements")
    Call<PagedResources<PayElement>> getAll(
            @Header("Authorization") String accessToken
    );

    @GET("payelements")
    Call<PagedResources<PayElement>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page);

    @GET("payelements/{payelementId}")
    Call<PayElement> get(
            @Header("Authorization") String accessToken,
            @Path("payelementId") String payelementId);


}
