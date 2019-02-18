package com.alex.trader.trend.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrendController {

    @GetMapping("/")
    public String getTrend(){

        if((Math.random()*10)>5) {
            return "Trend goes UP!";
        }else{
            return "Trend goes DOWN!";
        }
    }
}
