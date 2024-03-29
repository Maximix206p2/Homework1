package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hello {
    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }

    @RequestMapping("/")
    String home(){
        return "<h1>Hello, world!</h1>";
    }
}
