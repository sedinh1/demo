package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.KeyStats;

@RestController
public class DemoController {
    @RequestMapping("/test")
    public String test() {
        RestTemplate restTemplate = new RestTemplate();       
        KeyStats keystats = restTemplate.getForObject("https://api.iextrading.com/1.0/stock/aapl/stats", KeyStats.class);        
        return keystats.toString();
    } 

}
