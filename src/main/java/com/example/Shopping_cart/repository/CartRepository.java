package com.example.Shopping_cart.repository;

import com.example.Shopping_cart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
