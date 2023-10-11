package cz.inventi.kpj.spring.springintroduction.persistence;

import org.springframework.stereotype.Component;

@Component("greetingConstantRepository")
public class GreetingConstantRepositoryImpl implements GreetingRepository {

    //com

    @Override
    public String getGreetingText() {
        return "Hello from Mongo";
    }
}
