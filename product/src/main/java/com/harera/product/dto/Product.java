package com.harera.product.dto;


import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class Product {
    private Long id;
    private String name;
    private Integer categoryId;
    private Double amount;
    private Integer unitId;
    private Double price;
    private Date addingTime;
}
