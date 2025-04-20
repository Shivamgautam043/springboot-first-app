package firstJava.project.springboot_first_app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPI {
    @GetMapping("/hello-neo")
    public String firstFunction(){
    return "Hello Neo Welcome to the worlds";
    }
}
