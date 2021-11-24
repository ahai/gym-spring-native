package com.example.demo100ms;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloSpringNative {

    @GetMapping
    public String sayHello(){
        return "Hello, Spring Native";
    }
}
