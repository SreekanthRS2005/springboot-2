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
        return"WELCOME TO OUR E- COMMERCE APPLICATION"; 
    }
    @GetMapping("/ee")
    public String number(){
        return "OFFERS ON HURRY!!!";
    }
    @GetMapping("/sree")
    public String num(){
         return "THANK YOU FOR YOUR PURCHASE" ;
    }

    

}
