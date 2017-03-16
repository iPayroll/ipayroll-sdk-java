package nz.co.ipayroll.example;

import nz.co.ipayroll.sdk.configuration.ApiConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ApiConfiguration.class)
@ComponentScan
public class ExampleConfig {
}
