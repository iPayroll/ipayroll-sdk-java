package nz.co.ipayroll.example;

import nz.co.ipayroll.sdk.costcentre.CostCentreRepository;

import nz.co.ipayroll.sdk.costcentre.vo.CostCentre;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.hateoas.PagedResources;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class Application {


    private static final Logger logger = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfig.class);
        MockTokenService mockTokenService = context.getBean(MockTokenService.class);
        CostCentreRepository costCentreRepository = context.getBean(CostCentreRepository.class);

        costCentreRepository.getAll(mockTokenService.getAccessToken().token(), 100, 0).enqueue(new Callback<PagedResources<CostCentre>>() {
            @Override
            public void onResponse(Call<PagedResources<CostCentre>> call, Response<PagedResources<CostCentre>> response) {
                if (response.isSuccessful()) {
                    logger.info("success", response.body().getContent().size());
                }
                System.exit(0);
            }

            @Override
            public void onFailure(Call<PagedResources<CostCentre>> call, Throwable t) {
                logger.error("failed", t.getMessage());
            }
        });

    }
}
