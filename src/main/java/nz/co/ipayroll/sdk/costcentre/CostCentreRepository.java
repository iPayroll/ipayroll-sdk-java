package nz.co.ipayroll.sdk.costcentre;

import nz.co.ipayroll.sdk.costcentre.vo.CostCentre;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

@Repository
public interface CostCentreRepository {

    @GET("costcentres")
    Call<PagedResources<CostCentre>> getAll(
            @Header("Authorization") String accessToken,
            @Query("size") int size,
            @Query("page") int page
            );

    @GET("costcentres/{costcentreId}")
    Call<CostCentre> get(
            @Header("Authorization") String accessToken,
            @Path("costcentreId") Long costCentreId
    );

    @POST("costcentres")
    Call<List<CostCentre>> create(
            @Header("Authorization") String accessToken,
            @Body List<CostCentre> costCentres
    );


}
