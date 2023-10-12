package cz.inventi.kpj.spring.springintroduction.service;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingConstantRepositoryImpl;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingFileRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService{

    @Autowired
    GreetingConstantRepositoryImpl greetingConstantRepository;

    @Autowired
    GreetingFileRepositoryImpl greetingFileRepository;

    @Override
    public String getFileText() {
        return greetingFileRepository.getGreetingText();
    }

    @Override
    public String getConstantText() {
        return greetingConstantRepository.getGreetingText();
    }
}
