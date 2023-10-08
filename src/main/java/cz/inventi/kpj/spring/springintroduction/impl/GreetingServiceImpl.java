package cz.inventi.kpj.spring.springintroduction.impl;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import cz.inventi.kpj.spring.springintroduction.service.GreetingService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Data
@Service
public class GreetingServiceImpl implements GreetingService {

@Autowired
@Qualifier("greetingFileRepositoryImpl")
private GreetingRepository fileRepository;

@Autowired
@Qualifier("greetingConstantRepositoryImpl")
private GreetingRepository constantRepository;

    @Override
    public String getFileText(){
        return fileRepository.getGreetingText();
    };

    @Override
    public String getConstantText(){
       return constantRepository.getGreetingText();
   };
}
