package ru.chuldum.postgresdockertest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chuldum.postgresdockertest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
