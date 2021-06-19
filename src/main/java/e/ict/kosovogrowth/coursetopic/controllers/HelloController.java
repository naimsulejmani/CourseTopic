package e.ict.kosovogrowth.coursetopic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping("/world")
    public String getHelloWorld() {
        return "Hello World!";
    }
}
