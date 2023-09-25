package ru.chuldum.postgresdockertest.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
