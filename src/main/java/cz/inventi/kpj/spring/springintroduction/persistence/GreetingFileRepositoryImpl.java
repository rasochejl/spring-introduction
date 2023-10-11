package cz.inventi.kpj.spring.springintroduction.persistence;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("greetingFileRepository")
public class GreetingFileRepositoryImpl implements GreetingRepository {

    private ConfigurationProperties properties;

    @Autowired
    public GreetingFileRepositoryImpl(ConfigurationProperties properties) {
        this.properties = properties;
    }

    @Override
    public String getGreetingText() {
        return properties.getText();
    }
}
