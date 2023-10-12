package cz.inventi.kpj.spring.springintroduction.persistence;

import cz.inventi.kpj.spring.springintroduction.config.GreetingConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingFileRepositoryImpl implements GreetingRepository{
    @Autowired
    GreetingConfigProperties greetingConfigProperties;

    @Override
    public String getGreetingText() {
        return greetingConfigProperties.getText();
    }
}
