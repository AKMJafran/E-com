package com.example.demoApp2;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("compiling with 404 bug");
    }


}
