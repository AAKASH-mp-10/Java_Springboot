package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static java.lang.System.*;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(){
        System.out.println("Hello World");
        return "index.html";

    }
}
