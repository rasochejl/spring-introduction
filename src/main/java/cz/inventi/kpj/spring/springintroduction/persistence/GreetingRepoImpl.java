package cz.inventi.kpj.spring.springintroduction.persistence;

import cz.inventi.kpj.spring.springintroduction.config.GreetingProperties;
import org.springframework.stereotype.Component;

@Component
public class GreetingRepoImpl implements GreetingRepository{

    private final GreetingProperties properties;

    public GreetingRepoImpl(GreetingProperties properties) {
        this.properties = properties;
    }

    @Override
    public String getGreetingText() {
        return "Hello from mongo!";
    }
}
