package com.project1.springWebServices.repositories;

import com.project1.springWebServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
