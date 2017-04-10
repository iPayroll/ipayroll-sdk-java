package nz.co.ipayroll.api.sdk.error;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

@Service
public class ErrorService {
    
    @Autowired
    private Retrofit retrofit;
    
    public Error parseError(Response<?> response) throws IOException {
        Converter<ResponseBody, Error> converter = 
                retrofit.responseBodyConverter(Error.class, Error.class.getAnnotations());
        return converter.convert(response.errorBody());
    }

}
