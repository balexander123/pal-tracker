package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {

    private String greeting;

        public WelcomeController(@Value("${welcome.message}") final String message) {
        greeting = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return greeting;
    }
}
