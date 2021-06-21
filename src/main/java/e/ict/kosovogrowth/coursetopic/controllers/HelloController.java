package e.ict.kosovogrowth.coursetopic.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "hello")
public class HelloController {

  //  @CrossOrigin(origins = "http://localhost:9090")
    @GetMapping("/world")
    public String getHelloWorld() {
        return "Hello World!";
    }
}
