package cz.inventi.kpj.spring.springintroduction.configuration;

import cz.inventi.kpj.spring.springintroduction.configuration.properties.GreetingConfigurationProperties;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import cz.inventi.kpj.spring.springintroduction.persistence.impl.GreetingConstantRepositoryImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreetingConfigurationProperties.class)
public class GreetingConfiguration {
    @Bean(name = "greetingConstantRepositoryImpl")
    public GreetingRepository greetingConstantRepositoryImpl() {
        return new GreetingConstantRepositoryImpl();
    }
}
