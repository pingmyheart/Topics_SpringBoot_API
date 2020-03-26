package com.example.demo.controller;

import com.example.demo.model.Presentation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(){
        return "This is my first API developed in Spring Boot";
    }

    @RequestMapping("/introduce")
    public ArrayList<Presentation> sayHi() {
        Presentation p = new Presentation();
        ArrayList<Presentation> presentations = new ArrayList<>();
        presentations.add(p);
        return presentations;
    }
}
