package cz.inventi.kpj.spring.springintroduction;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;


@Data
@Configuration
@Validated
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "spring-introduction.greeting")
public class ConfigurationProperties {

    @NotNull
    private String text;

}
