package cz.inventi.kpj.spring.springintroduction;


import cz.inventi.kpj.spring.springintroduction.persistence.GreetingConstantRepositoryImpl;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@EnableConfigurationProperties(GreetingConfigurationProperties.class)
public class GreetingConfig {
    @Bean(name = "greetingConstantRepositoryImpl")
    @Scope(scopeName = "prototype")
    public GreetingRepository greetingConstantRepositoryImpl() {
        return new GreetingConstantRepositoryImpl();
    }
}
