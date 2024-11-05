package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong(5);


    @GetMapping("/greeting")
Greeting greeting(@RequestParam(defaultValue="World Bengisu Özcan 64535") String name){
        Greeting greet = new Greeting(counter.incrementAndGet(), String.format(template, name));
        System.out.println("greet "+greet.getId() +greet.getContent());
        return greet;
    }
}

