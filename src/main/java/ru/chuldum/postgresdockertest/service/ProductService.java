package ru.chuldum.postgresdockertest.service;

import org.springframework.stereotype.Service;
import ru.chuldum.postgresdockertest.dto.ProductRequest;
import ru.chuldum.postgresdockertest.model.Product;

@Service
public class ProductService {

    public void createProduct(ProductRequest productRequest) {

        // Короче это вариант создания экземпляра Product
        // обрати внимание что в сущности Product есть аннотация @Builder
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }
}
