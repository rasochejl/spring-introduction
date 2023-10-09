package cz.inventi.kpj.spring.springintroduction.persistence;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingConfigurationProperties;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingConstantRepositoryImpl;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreetingConfigurationProperties.class)
@ComponentScan(basePackages = "cz.inventi.kpj.spring.springintroduction")



public class GreetingConfiguration {
    @Bean(name = "greetingConstantRepositoryImpl")
    public GreetingRepository greetingConstantRepositoryImpl() {
        return new GreetingConstantRepositoryImpl();
    }
}