# Introduction

The iPayroll Restful Api allows you manipulate some of your iPayroll data through 
third party application. In order to start a quick Java project with iPayroll 
Restful api, we created the iPayroll java sdk project to help you quickly start 
a project to interact with iPayroll Restful API by Java.

## Documentations

All of iPayroll Restful Api documentation can be found at [here](http://dev.ipayroll.co.nz).

# How to use

1. create a `application.properties` file and include it in your classpath. An example is under:

```
# the ipayroll server you want query to
ipayroll_server=http://secure2.ipayroll.co.nz

# the developer token you get from your paymaster
# the codes should be replaced by your own one
ipayroll_client_id=344003b7-0d76-496f-9d24-1ffd0ea01dbc
ipayroll_client_secret=QrDDMTi6nGcH4W8

# a call back url for ipayroll java sdk to handle authentication
# the url should be replaced by your own one
ipayroll_redirect_uri=http://10.104.6.249:8090/ipayroll/callback
```

2. if you are using [spring](http://google.co.nz), you need include the sdk's configuration `nz.co.ipayroll.api.sdk.configuration.ApiConfiguration`. For example:

```java
package nz.co.ipayroll.sdk.example;

import nz.co.ipayroll.api.sdk.configuration.ApiConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Import(ApiConfiguration.class)
public class ExampleConfiguration extends WebMvcConfigurerAdapter {
```

3. you will need to create a callback API for iPayroll to use to pass the authentication. Notice, the path has to be same as the one you defined in your `applicaiton.proerties`.
For example:

```java
    @Autowired
    private AccessTokenService tokenService;

    // callback for ipayroll
    @RequestMapping(value = "/ipayroll/callback")
    public AccessToken callback(String code) throws IOException {
        AccessToken accessToken = tokenService.getAccessToken(code);
        return accessToken;
    }
```

4. Once you have a token and you need save it properly. If the token is refreshed, the old token will be invalid to use.
5. With a valid token, you can interact with iPayroll services with your token. Since we are using [retrofit]() for the api calls,
you can see more detail for either async or sync calls from retrofit api document. Here is an example:

```java
 @Autowired
 private CostCentreRepository costCentreRepository;

 @RequestMapping(value = "/costcentres")
    public Collection<CostCentre> costcentres() throws IOException {
        if(token == null) {
            throw new AccessTokenNotFoundException();
        }
        PagedResources<CostCentre> costCentres = costCentreRepository.getAll(token.token(), 100, 0).execute().body();
        return costCentres.getContent();
    }
```

## How to get a developer token

You can either contact your paymaster or drop an email to our (api email)

# How to run example

1. checkout the project by `git clone [our repository url]`
2a. if you are using any java IDE such as Intellij, you can
    2a.1. add application.properties to your project and make sure it's on your classpath
    2a.2. navigate to sdk-example/main/java/nz/co/ipayroll/sdk/example/Application.java
     and start the the main method.
2b. build by using `gradle jar`
    2b.1. navigate to the directory contains you sdk-example.jar
    2b.2. run `java -jar sdk-example.jar`
3. go to your localhost:8080 you will see a page with two links.
4. click authenticate link to gain a token.
5. once you have granted a access token, you can come back to the same page and click get costcenters.


# Dependencies

springBootVersion = '1.4.1.RELEASE'
springVersion = '4.3.4.RELEASE'
springHateoasVersion = '0.18.0.RELEASE'
javaVersion = '1.8'
jbotVersion = '3.0.2'
retrofitVersion = '2.1.0'
okHttpVersion = '3.3.0'
jodaTimeVersion = '2.9.4'
quartzVersion = '2.2.1'
jedisVersion = '2.8.1'
springDataRedisVersion = '1.7.5.RELEASE'
jacksonVersion = '2.8.7'

# Contribution

Pull request are welcome.