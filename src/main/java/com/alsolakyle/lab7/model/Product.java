package com.alsolakyle.lab7.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;     // Unique identifier
    private String name; // Name of the product
    private Double price; // Price of the product
}
