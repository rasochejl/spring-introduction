package cz.inventi.kpj.spring.springintroduction.persistence;

import org.springframework.stereotype.Component;

@Component
public class GreetingConstantRepositoryImpl implements GreetingRepository{

    @Override
    public String getGreetingText() {
        return "Hello from Mongo";
    }
}
