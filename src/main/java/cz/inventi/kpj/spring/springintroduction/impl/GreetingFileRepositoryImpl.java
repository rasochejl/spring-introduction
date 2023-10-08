package cz.inventi.kpj.spring.springintroduction.impl;
import cz.inventi.kpj.spring.springintroduction.GreetingConfigurationProperties;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class GreetingFileRepositoryImpl implements GreetingRepository {

    @Autowired
    private GreetingConfigurationProperties greetingConfigurationProperties;

    @Override
    public String getGreetingText()    {
        return greetingConfigurationProperties.getText();
    }
}
