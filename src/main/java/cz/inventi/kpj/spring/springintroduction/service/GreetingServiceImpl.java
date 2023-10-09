package cz.inventi.kpj.spring.springintroduction.service;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service()
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    @Qualifier("GreetingFileRepositoryImpl")
    private GreetingRepository greetingFileRepository;
    @Autowired
    @Qualifier("GreetingConstantRepositoryImpl")
    private GreetingRepository greetingConstantRepository;

    @Override
    public String getFileText() {
        return greetingFileRepository.getGreetingText();
    }

    @Override
    public String getConstantText() {
        return greetingConstantRepository.getGreetingText();
    }
}
