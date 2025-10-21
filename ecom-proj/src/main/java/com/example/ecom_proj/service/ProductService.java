package com.example.ecom_proj.service;


import com.example.ecom_proj.model.Products;
import com.example.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {



    @Autowired
    private ProductRepo repo;

    public List<Products> getAllProducts() {

   return repo.findAll();
    }



}
