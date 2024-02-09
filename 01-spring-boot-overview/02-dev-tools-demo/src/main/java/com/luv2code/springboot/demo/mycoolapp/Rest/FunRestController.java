package com.luv2code.springboot.demo.mycoolapp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController///// it is main function in frame work. used to connect with our server and cn ommnicatewith our server

public class FunRestController {
    
    /////////
    @GetMapping("/")//it is aa super function.  used to create and acceess our server  with required name
    public String sayhello(){//with our different metood of creation
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
    @GetMapping("/sree")//in this we can use all type of data type..
    public double num(){
         return 22.44;
    }

    

}
