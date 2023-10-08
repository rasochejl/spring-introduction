package cz.inventi.kpj.spring.springintroduction.config;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingFileRepositoryImpl implements GreetingRepository {
    private final GreetingProperties properties;

    @Autowired
    public GreetingFileRepositoryImpl(GreetingProperties properties) {
        this.properties = properties;
    }

    public String getGreetingText() {
        return properties.getText();
    }
}
