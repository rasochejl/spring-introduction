package cz.inventi.kpj.spring.springintroduction.service;


import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    @Qualifier("greetingConstantRepositoryImpl")
    private GreetingRepository constantRepository;

    @Autowired
    @Qualifier("greetingFileRepositoryImpl")
    private GreetingRepository fileRepository;

    @Override
    public String getConstantText() {
        return constantRepository.getGreetingText();
    }

    @Override
    public String getFileText() {
        return fileRepository.getGreetingText();
    }
}