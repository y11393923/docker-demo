package com.zyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019/3/11
 * @since 1.0.0
 */
@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @GetMapping("/")
    public String hello(){
        return "Hello Docker!";
    }
}
