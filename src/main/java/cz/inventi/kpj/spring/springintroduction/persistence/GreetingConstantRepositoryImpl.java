package cz.inventi.kpj.spring.springintroduction.persistence;

public class GreetingConstantRepositoryImpl implements GreetingRepository{

    @Override
    public String getGreetingText() {
        return "Hello from Mongo";
    }
}
