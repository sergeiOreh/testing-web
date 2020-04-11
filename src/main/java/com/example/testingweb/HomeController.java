package com.example.testingweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private final MyService service;

    @Autowired
    public HomeController(MyService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

    public String callService(){
        return service.printMessage();
    }

}