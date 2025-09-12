package com.example.demoApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component

public class Dev {


           @Autowired
           @Qualifier("laptop")
            private Computer Comp ;


            public void build(){

                Comp.compile();
                System.out.println("working in Awesome project");

            }


}
