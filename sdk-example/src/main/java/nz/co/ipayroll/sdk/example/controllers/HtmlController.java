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
        System.out.println("Code: "+code);
        AccessToken accessToken = tokenService.getAccessToken(code);
        System.out.println("AccessToken: "+accessToken);
        session.setAttribute(IPAYROLL_TOKEN, accessToken);
        return "redirect:/";
    }

}
