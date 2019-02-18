package com.alex.trader.news.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/")
    public String getNews(){

        if((Math.random()*10)>5) {
            return "Good news general!";
        }else{
            return "Bad news general!";
        }
    }
}
