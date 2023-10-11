package cz.inventi.kpj.spring.springintroduction.service;

import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingConstantRepository;

    private GreetingRepository greetingFileRepository;


    @Autowired
    public GreetingServiceImpl(GreetingRepository greetingConstantRepository, GreetingRepository greetingFileRepository) {
        this.greetingConstantRepository = greetingConstantRepository;
        this.greetingFileRepository = greetingFileRepository;
    }

    // Ukázka použití s anotací @Qualifier
//    @Autowired
//    public GreetingServiceImpl(@Qualifier("greetingConstantRepository") GreetingRepository aa, @Qualifier("greetingFileRepository") GreetingRepository bb) {
//        this.greetingConstantRepository = aa;
//        this.greetingFileRepository = bb;
//    }

    @Override
    public String getFileText() {
        return greetingFileRepository.getGreetingText();
    }

    @Override
    public String getConstantText() {
        return greetingConstantRepository.getGreetingText();
    }
}
