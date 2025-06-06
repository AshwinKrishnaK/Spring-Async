package com.example.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class App1Service {

    @Autowired
    private RestTemplate restTemplate;

    @Async
    public void sendMessageToApp2() {
        try {
            String response = restTemplate.getForObject("http://localhost:8081/app2/message", String.class);
            System.out.println("Response from app2 " + response);

        } catch (Exception e){
            System.out.println("Error in sending request to APP2");
        }
    }
}
