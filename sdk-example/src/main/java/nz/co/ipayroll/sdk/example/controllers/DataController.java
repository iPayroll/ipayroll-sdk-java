package nz.co.ipayroll.sdk.example.controllers;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nz.co.ipayroll.api.sdk.costcentre.CostCentreRepository;
import nz.co.ipayroll.api.sdk.costcentre.vo.CostCentre;
import nz.co.ipayroll.api.sdk.oauth.AOuthClientConfiguration;
import nz.co.ipayroll.api.sdk.oauth.AccessTokenService;
import nz.co.ipayroll.api.sdk.oauth.vo.AccessToken;
import nz.co.ipayroll.api.sdk.timesheet.TimesheetRepository;
import nz.co.ipayroll.api.sdk.timesheet.vo.Timesheet;
import nz.co.ipayroll.sdk.example.AccessTokenNotFoundException;

@RestController
public class DataController {

    @Autowired
    private CostCentreRepository costCentreRepository;
    
    @Autowired
    private TimesheetRepository timesheetRepository;

    @Autowired
    private AccessTokenService accessTokenService;
 
    @RequestMapping(value = "aouth2/configuration")
    public AOuthClientConfiguration aouth2Configuration(HttpSession session) throws IOException {
        return accessTokenService.getConfiguration();
    }
    
    @RequestMapping(value = "/costcentres")
    public Collection<CostCentre> costcentres(HttpSession session) throws IOException {
        AccessToken token = (AccessToken) session.getAttribute(HtmlController.IPAYROLL_TOKEN);
        if(token == null) {
            throw new AccessTokenNotFoundException();
        }
        PagedResources<CostCentre> costCentres = costCentreRepository.getAll(token.token(), 100, 0).execute().body();
        return costCentres.getContent();
    }

    @RequestMapping(value = "/timesheets")
    public Collection<Timesheet> timesheets(HttpSession session) throws IOException {
        AccessToken token = (AccessToken) session.getAttribute(HtmlController.IPAYROLL_TOKEN);
        if(token == null) {
            throw new AccessTokenNotFoundException();
        }
        PagedResources<Timesheet> timesheets = timesheetRepository.getAll(token.token(), 100, 0).execute().body();
        return timesheets.getContent();
    }
    
    @RequestMapping(value = "/removeTimesheets")
    public Collection<Timesheet> removeTimesheets(HttpSession session, String id) throws IOException {
        AccessToken token = (AccessToken) session.getAttribute(HtmlController.IPAYROLL_TOKEN);
        if(token == null) {
            throw new AccessTokenNotFoundException();
        }
        timesheetRepository.delete(token.token(), id).execute();
        return timesheets(session);
    }
    
}
