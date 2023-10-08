package cz.inventi.kpj.spring.springintroduction.impl;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;

public class GreetingConstantRepositoryImpl implements GreetingRepository {
    public GreetingConstantRepositoryImpl(){};

    @Override
    public String getGreetingText(){
        return "Hello from Mongo";
    }

}
