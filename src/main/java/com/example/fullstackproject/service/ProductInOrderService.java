package com.example.fullstackproject.service;


import com.example.fullstackproject.model.ProductInOrder;
import com.example.fullstackproject.model.User;

public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
