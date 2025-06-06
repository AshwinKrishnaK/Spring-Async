package com.example.app2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @GetMapping("app2/message")
    public String getMessage(){
        return "Hello From APP2";
    }

}
