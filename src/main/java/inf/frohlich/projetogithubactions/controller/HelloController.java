package inf.frohlich.projetogithubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Ola povo, estou alterando este codigo!";
    }
    @GetMapping("/oiAula")
    public String oiAula() {
        return "oi povo, vamos testar o nosso github actions";
    }
    @GetMapping("/tres")
    public String tres() {
        return "testando";
    }
}