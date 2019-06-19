package com.praveen.sslspringboot.example.demo.controller;

import com.praveen.sslspringboot.example.demo.data.Weather;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/weather")
    public Weather getWeather() {
        return new Weather();
    }
}
