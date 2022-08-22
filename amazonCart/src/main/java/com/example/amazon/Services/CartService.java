package com.example.amazon.Services;

import java.util.UUID;

import com.example.amazon.Entity.CartModel;
import com.example.amazon.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public void addItemToCartService(CartModel cart ){
        cartRepository.save(cart);
    }
    public void removeItemFromCartService(CartModel cart ){
        cartRepository.delete(cart);
    }
    public void displayAllProductsInCart(UUID userId){}

    }

