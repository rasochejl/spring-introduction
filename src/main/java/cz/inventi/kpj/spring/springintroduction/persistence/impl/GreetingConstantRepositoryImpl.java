package cz.inventi.kpj.spring.springintroduction.persistence.impl;


import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;

public class GreetingConstantRepositoryImpl implements GreetingRepository {
    @Override
    public String getGreetingText() {
        return "Hello from Mongo";
    }
}
