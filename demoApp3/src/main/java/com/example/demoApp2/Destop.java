package com.example.demoApp2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Destop implements Computer{

            public  void compile(){
                System.out.println("compiling is very fast with 404 bugs------Destop");

            }

}
