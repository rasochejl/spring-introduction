package cz.inventi.kpj.spring.springintroduction.persistence;


import cz.inventi.kpj.spring.springintroduction.GreetingConfigurationProperties;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GreetingFileRepositoryImpl implements GreetingRepository {

    private final GreetingConfigurationProperties properties;

    @Override
    public String getGreetingText() {
        return properties.getText();
    }
}
