package cz.inventi.kpj.spring.springintroduction.persistence;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "spring-introduction.greeting")
public class GreetingFileRepositoryImpl implements GreetingRepository{

    private String text;

    @Override
    public String getGreetingText() {
        return text;
    }
}
