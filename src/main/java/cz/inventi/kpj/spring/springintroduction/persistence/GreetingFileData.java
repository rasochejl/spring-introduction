package cz.inventi.kpj.spring.springintroduction.persistence;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "spring-introduction.greeting")
public class GreetingFileData {
    private String text;
}
