package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String printMessage(){
        System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        return "You're welcome";
    }
}
