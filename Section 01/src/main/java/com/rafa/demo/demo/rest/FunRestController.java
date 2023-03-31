package com.rafa.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello World</h1>";
    }
    // expose "/workout"
    @GetMapping("/workout")
    public String workout(){
        return "<h1>Run a hard 5k!</h1>";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Out of cookies, sorry";
    }
}
