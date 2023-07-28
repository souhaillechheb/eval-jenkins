package com.example.souhailapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkController {

    @GetMapping("/build")
    public String getInfo(){
        return "projet creer pour : \n eval devops ";
    }
}
