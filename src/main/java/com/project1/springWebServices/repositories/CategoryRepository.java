package com.project1.springWebServices.repositories;

import com.project1.springWebServices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
