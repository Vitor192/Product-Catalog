package com.example.Shopping_cart.controller;

import com.example.Shopping_cart.model.Cart;
import com.example.Shopping_cart.model.Item;
import com.example.Shopping_cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @RequestMapping(value = "/{id})", method = RequestMethod.POST)
    public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
        Optional<Cart> saveCart = cartRepository.findById(id);
        Cart cart;
        if (saveCart.equals(Optional.empty())) {
            cart = new Cart(id);
        }
        else {
            cart = saveCart.get();
        }
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Cart> findByID(@PathVariable("id") Integer id) { return cartRepository.findById(id); }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void  clear(@PathVariable("id") Integer id) {cartRepository.deleteById(id);}
}
