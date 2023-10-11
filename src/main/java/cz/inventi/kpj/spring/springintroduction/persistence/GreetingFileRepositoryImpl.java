package cz.inventi.kpj.spring.springintroduction.persistence;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class GreetingFileRepositoryImpl implements GreetingRepository{

    @NotNull
    private String value;

    @Override
    public String getGreetingText() {
        return value;
    }
}
