package cz.inventi.kpj.spring.springintroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import lombok.Data;

@Data
@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    @Qualifier("constantRepo")    
    private GreetingRepository greetingConstantRepository;
    @Autowired
    @Qualifier("fileRepo")
    GreetingRepository greetingFileRepository;


    @Override
    public String getFileText() { 
        return greetingFileRepository.getGreetingText();
    }

    @Override
    public String getConstantText() {
        return greetingConstantRepository.getGreetingText();
    }
    
}
