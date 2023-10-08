package cz.inventi.kpj.spring.springintroduction.persistence;

import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository {
    /**
     * Load greeting text
     * @return text of the greeting
     */

    String getGreetingText();
}
