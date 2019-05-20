package nz.co.ipayroll.sdk.example.controllers;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import nz.co.ipayroll.api.sdk.oauth.AccessTokenService;
import nz.co.ipayroll.api.sdk.oauth.vo.AccessToken;

@Controller
public class HtmlController {

    public static final String IPAYROLL_TOKEN = "IPAYROLL_TOKEN";

    @Autowired
    private AccessTokenService tokenService;

    @RequestMapping(value = "/ipayroll/callback")
    public String callback(String code, HttpSession session) throws IOException {
        AccessToken accessToken = tokenService.getAccessToken(code);
        session.setAttribute(IPAYROLL_TOKEN, accessToken);
        return "redirect:/";
    }

    @RequestMapping(value = "/ipayroll/refreshtoken")
    public String refreshtoken(String code, HttpSession session) throws IOException {
        AccessToken accessToken = tokenService.refreshAccessToken("7eab07bc-8f90-4891-b8a0-21da49191f52");
        System.out.println("AccessToken: " + accessToken);
        session.setAttribute(IPAYROLL_TOKEN, accessToken);
        return "redirect:/";
    }
}
