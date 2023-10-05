package cz.inventi.kpj.spring.springintroduction.persistence;

public interface GreetingRepository {
    /**
     * Load greeting text
     * @return text of the greeting
     */

    String getGreetingText();
}
