package ru.chuldum.postgresdockertest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.chuldum.postgresdockertest.dto.ProductRequest;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {

    }
}
