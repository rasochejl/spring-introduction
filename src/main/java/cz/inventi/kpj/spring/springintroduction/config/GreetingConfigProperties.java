package cz.inventi.kpj.spring.springintroduction.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "spring-introduction.greeting")
public class GreetingConfigProperties {
    String text;
}
