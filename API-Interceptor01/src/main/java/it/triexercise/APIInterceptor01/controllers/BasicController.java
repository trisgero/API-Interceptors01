package it.triexercise.APIInterceptor01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping
    public String getTime() {
        LocalDateTime now = LocalDateTime.now();
        return "This is the current date and time: " + now;
    }

}
