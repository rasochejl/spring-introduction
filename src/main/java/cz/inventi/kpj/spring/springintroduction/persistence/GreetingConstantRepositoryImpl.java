package cz.inventi.kpj.spring.springintroduction.persistence;
import org.springframework.stereotype.Service;

@Service("GreetingConstantRepositoryImpl")
public class GreetingConstantRepositoryImpl implements GreetingRepository {

    public String getGreetingText(){
        return "Hello from Mongo";
    }

}
