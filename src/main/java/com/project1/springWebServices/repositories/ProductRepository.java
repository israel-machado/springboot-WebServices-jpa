package com.project1.springWebServices.repositories;

import com.project1.springWebServices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
