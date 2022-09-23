package com.example.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {



  @GetMapping("/home")
  public String home(){
    return "home";
  }


  @GetMapping("/organisationsinformation")
  public String organisationsinformation(){
    return "organisationsinformation";
  }

  @GetMapping("/kontaktOs")
  public String kontaktOs(){
    return "kontaktOs";
  }

  @GetMapping("/forbrugerinformation")
  public String forbrugerInformation(){
    return "forbrugerinformation";
  }
}
