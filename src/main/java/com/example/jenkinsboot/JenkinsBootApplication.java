package com.example.jenkinsboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@SpringBootApplication
public class JenkinsBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsBootApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello,World!ccc "+ LocalTime.now().toString();
    }
}
