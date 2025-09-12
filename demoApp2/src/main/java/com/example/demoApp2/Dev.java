package com.example.demoApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dev {



            // feild injuction.....53:28
            //========================================================
            //@Autowired
           private Laptop laptop ;//by auto wire  we said Dev depends on Laptop..instead of application context here....

            //setter injuction
            //=======================================================
            @Autowired
            public void setLaptop(Laptop laptop) {
                this.laptop = laptop;
            }



            //constructor injuction...
            //============================================================
             //   @Autowired
               //  public  Dev(Laptop laptop) {// we should pass  object to this..
                                                             // .Laptop lap = new Laptop()
                                                            // Dev dev = new Dev(lap); autowire make this ease
                 //   this.laptop = laptop;

                 //}



        public void build(){

            laptop.compile();
            System.out.println("working in Awesome project");

        }


}
