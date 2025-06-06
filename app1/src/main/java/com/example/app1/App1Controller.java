package com.example.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

    @Autowired
    private App1Service service;

    @GetMapping("/app2")
    public String app2Async(){
        service.sendMessageToApp2();
        return "Message send to App2";
    }

    @GetMapping("/request")
    public String app2DelayedAsync(){
        service.sendMessageToApp2Delayed();
        return "Message send to APP2 - Delayed";
    }

}
