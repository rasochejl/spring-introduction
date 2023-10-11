package cz.inventi.kpj.spring.springintroduction.config;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingConstantRepositoryImpl;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingFileRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

    @Bean
    public GreetingConstantRepositoryImpl getConstant(){
        return new GreetingConstantRepositoryImpl();
    }

    @Bean
    public GreetingFileRepositoryImpl getFile() {
        return new GreetingFileRepositoryImpl();
    }
}
