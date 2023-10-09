package cz.inventi.kpj.spring.springintroduction.persistence;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("constantRepo")
public class GreetingConstantRepositoryImpl implements GreetingRepository {
    public String getGreetingText(){
        return "Hello from Mongo";
    }
}
