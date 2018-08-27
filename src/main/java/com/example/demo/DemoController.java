package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.KeyStats;

@RestController
public class DemoController {
    @RequestMapping("/test/{name}")
    public String test(@PathVariable(value = "name") String name) {
        RestTemplate restTemplate = new RestTemplate();       
        KeyStats keystats = restTemplate.getForObject("https://api.iextrading.com/1.0/stock/" + name + "/stats", KeyStats.class);        
        return keystats.toString();
    } 

}
 