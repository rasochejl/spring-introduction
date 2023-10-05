package cz.inventi.kpj.spring.springintroduction.service.impl;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import cz.inventi.kpj.spring.springintroduction.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Autowired
    @Qualifier("greetingFileRepositoryImpl")
    private GreetingRepository repository;
    @Autowired
    @Qualifier("greetingConstantRepositoryImpl")
    private GreetingRepository constantRepository;
    @Override
    public String getFileText() {
        return repository.getGreetingText();
    }

    @Override
    public String getConstantText() {
        return constantRepository.getGreetingText();
    }
}
