package com.project1.springWebServices.repositories;

import com.project1.springWebServices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
