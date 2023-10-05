package cz.inventi.kpj.spring.springintroduction.persistence.impl;

import cz.inventi.kpj.spring.springintroduction.configuration.properties.GreetingConfigurationProperties;
import cz.inventi.kpj.spring.springintroduction.persistence.GreetingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GreetingFileRepositoryImpl implements GreetingRepository {
    private final GreetingConfigurationProperties properties;

    @Override
    public String getGreetingText() {
        return properties.getText();
    }
}
