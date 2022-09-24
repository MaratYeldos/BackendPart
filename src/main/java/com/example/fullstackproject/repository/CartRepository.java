package com.example.fullstackproject.repository;

import com.example.fullstackproject.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CartRepository extends JpaRepository<Cart, Integer> {
}
