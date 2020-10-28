package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AmitAgarwal on 10/27/20.
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello from Amit";
    }

}
