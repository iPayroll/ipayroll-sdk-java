package nz.co.ipayroll.sdk.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No access token found")  // 404
public class AccessTokenNotFoundException extends RuntimeException {

}
