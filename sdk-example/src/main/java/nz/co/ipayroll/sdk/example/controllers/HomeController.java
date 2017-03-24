package nz.co.ipayroll.sdk.example.controllers;

import nz.co.ipayroll.api.sdk.costcentre.CostCentreRepository;
import nz.co.ipayroll.api.sdk.costcentre.vo.CostCentre;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenService;
import nz.co.ipayroll.api.sdk.oauth.vo.AccessToken;
import nz.co.ipayroll.sdk.example.AccessTokenNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collection;

@RestController
public class HomeController {

    private static AccessToken token;

    @Autowired
    private AccessTokenService tokenService;

    @Autowired
    private CostCentreRepository costCentreRepository;

    // callback for ipayroll
    @RequestMapping(value = "/ipayroll/callback")
    public AccessToken callback(String code) throws IOException {
        AccessToken accessToken = tokenService.getAccessToken(code);
        HomeController.token = accessToken;
        return accessToken;
    }

    @RequestMapping(value = "/costcentres")
    public Collection<CostCentre> costcentres() throws IOException {
        if(token == null) {
            throw new AccessTokenNotFoundException();
        }
        PagedResources<CostCentre> costCentres = costCentreRepository.getAll(token.token(), 100, 0).execute().body();
        return costCentres.getContent();
    }
}
