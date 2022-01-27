package com.portfolio.system_of_car_control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {



    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/widgets")
    public String widget(){
        return "widgets";
    }





}
