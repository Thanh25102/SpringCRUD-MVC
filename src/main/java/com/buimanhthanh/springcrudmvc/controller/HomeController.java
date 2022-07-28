package com.buimanhthanh.springcrudmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
}
