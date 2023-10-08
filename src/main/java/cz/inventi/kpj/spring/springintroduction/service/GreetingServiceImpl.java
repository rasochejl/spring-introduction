package cz.inventi.kpj.spring.springintroduction.service;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    @Qualifier("greetingRepoImpl")
    private GreetingRepository greetingRepository;
    @Autowired
    @Qualifier("greetingFileRepositoryImpl")
    private GreetingRepository greetingFile;



    @Override
    public String getFileText() {
        return greetingFile.getGreetingText();
    }

    @Override
    public String getConstantText() {
        return greetingRepository.getGreetingText();
    }
}
