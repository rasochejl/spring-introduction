package cz.inventi.kpj.spring.springintroduction.config;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring-introduction.greeting")
public class GreetingConfigProperties {
    @NotBlank
    String text;
}
