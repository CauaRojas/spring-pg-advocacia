package br.com.fiap.springpgadvocacia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringPgAdvocaciaApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringPgAdvocaciaApplication.class, args );
    }

    @GetMapping(value = "/")
    public String index() {
        return  "<h1>Spring Benezinho Advocacia</h1>" +
                "<p>API REST para gerenciamento de processos judiciais</p>";
    }
}
