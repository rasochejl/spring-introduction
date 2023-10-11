package cz.inventi.kpj.spring.springintroduction.service;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingConstantRepositoryImpl;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingFileRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceImpl implements GreetingService{

    @Bean
    public String getConstant() {
        GreetingConstantRepositoryImpl greetingConstantRepository = new GreetingConstantRepositoryImpl();
        return greetingConstantRepository.getGreetingText();
    }

    @Bean
    public String getFile() {
        GreetingFileRepositoryImpl fileRepository = new GreetingFileRepositoryImpl();
        return fileRepository.getGreetingText();
    }

    @Override
    public String getFileText() {
        return getFile();
    }

    @Override
    public String getConstantText() {
        return getConstant();
    }
}
