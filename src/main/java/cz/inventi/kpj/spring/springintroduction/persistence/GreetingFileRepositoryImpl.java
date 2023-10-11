package cz.inventi.kpj.spring.springintroduction.persistence;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@ConfigurationProperties(prefix = "spring-introduction.greeting")
public class GreetingFileRepositoryImpl implements GreetingRepository{

    @NotNull
    private String text;

    @Override
    public String getGreetingText() {
        return text;
    }
}
