package cz.inventi.kpj.spring.springintroduction.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GreetingFileRepositoryImpl")
public class GreetingFileRepositoryImpl implements GreetingRepository  {

    @Autowired
    private GreetingConfigurationProperties properties;

    public String getGreetingText() {
        return properties.getText();
    }

}
