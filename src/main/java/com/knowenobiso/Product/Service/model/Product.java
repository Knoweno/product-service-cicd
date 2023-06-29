package com.knowenobiso.Product.Service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value="product_tbl")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    @Id //For a unique identifier
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
