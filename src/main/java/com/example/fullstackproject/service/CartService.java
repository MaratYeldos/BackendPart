package com.example.fullstackproject.service;


import com.example.fullstackproject.model.Cart;
import com.example.fullstackproject.model.ProductInOrder;
import com.example.fullstackproject.model.User;

import java.util.Collection;

public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
