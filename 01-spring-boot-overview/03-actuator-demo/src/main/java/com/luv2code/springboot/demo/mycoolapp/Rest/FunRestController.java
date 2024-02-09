package com.luv2code.springboot.demo.mycoolapp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController/// comunicate with server...

public class FunRestController {//clas
    
    /////////
    @GetMapping("/")// to control a server with default name...
    public String sayhello(){//diff method with same name overload....
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
