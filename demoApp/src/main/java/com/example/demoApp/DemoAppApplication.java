package com.example.demoApp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {



		ApplicationContext context =SpringApplication.run(DemoAppApplication.class, args);

	}

}
