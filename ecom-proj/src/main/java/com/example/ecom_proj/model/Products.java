package com.example.ecom_proj.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table
@Data

@AllArgsConstructor
@NoArgsConstructor
public class Products {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id") // primary key column
     private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "descr")
    private String descr;

    @Column(name = "brand")
    private String brand;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "category")
    private String category;

    @Column(name = "releasedate")
    private LocalDateTime releaseDate;


    @Column(name = "available")
    private boolean available;

    @Column(name = "quantity")
    private int quantity;
}
