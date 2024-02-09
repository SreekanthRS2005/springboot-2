package com.luv2code.springboot.demo.mycoolapp.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    //injection properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @Value("${location.name}")
    private String location;
    @Value("${sports.name}")
    private String game;
     //expose new end points"teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "COACH NAME" +coachName +"\t TEAM NAME"+teamName +"\n LOCATION"+ location+"\n GAME NAME"+ game;
    }
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


    


