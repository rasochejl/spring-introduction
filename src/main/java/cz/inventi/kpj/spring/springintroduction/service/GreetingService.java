package cz.inventi.kpj.spring.springintroduction.service;

public interface GreetingService {
    /**
     * Load text from the file.
     *
     * @return text from the file
     */
    String getFileText();

    /**
     * Load text from the code.
     *
     * @return text from the code
     */
    String getConstantText();
}
