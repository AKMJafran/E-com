package com.example.ecom_proj.controller;


import com.example.ecom_proj.model.Products;
import com.example.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

   @Autowired
   private ProductService service;

        @RequestMapping("/home")
        public String greet(){
            return "Hello World";
        }




        @GetMapping("products")
        public List<Products>   getAllProducts(){
            return service.getAllProducts();
        }



}