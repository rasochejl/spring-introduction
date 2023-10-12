package cz.inventi.kpj.spring.springintroduction.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Data
@ConfigurationProperties(prefix = "spring-introduction.greeting")
public class GreetingConfigProperties {

    String text;
}