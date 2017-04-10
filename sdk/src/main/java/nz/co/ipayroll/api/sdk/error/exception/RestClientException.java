package nz.co.ipayroll.api.sdk.error.exception;

import nz.co.ipayroll.api.sdk.error.Error;

public class RestClientException extends RuntimeException {

    private final Error error;

    public RestClientException(Throwable exception, Error error) {
        super(error.getErrorDescription(), exception);
        this.error = error;
    }
    
    public RestClientException(Error error) {
        super(error.getErrorDescription());
        this.error = error;
    }
    
    public Error asError() {
        return error;
    }

}
