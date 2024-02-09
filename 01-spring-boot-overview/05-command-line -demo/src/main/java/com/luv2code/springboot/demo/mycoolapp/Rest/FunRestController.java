package com.luv2code.springboot.demo.mycoolapp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    
    /////////
    @GetMapping("/")
    public String sayhello(){
        return "hi i am sree";
    }
    @GetMapping("/r")
    public String Sree(){
        return"apprama sapadra"; 
    }
    @GetMapping("/ee")
    public int number(){
        return 30;
    }
    @GetMapping("/sree")
    public double num(){
         return 22.44;
    }

    

}
