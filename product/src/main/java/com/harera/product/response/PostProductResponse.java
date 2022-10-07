package com.harera.product.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class PostProductResponse {
    private Long id;
    private String name;
    private Integer categoryId;
    private Double amount;
    private Integer unitId;
    private Double price;
    private String addingTime;
}
