package cz.inventi.kpj.spring.springintroduction.controllers;

import cz.inventi.kpj.spring.springintroduction.service.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AppController {
    private final GreetingService greetingService;

    public String getGreeting() {
        return greetingService.getConstantText();
    }

    public String getGreetingFromFile() {
        return greetingService.getFileText();
    }

}
