package com.example.amazonCart.Service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.amazonCart.Entity.CartModel;
import com.example.amazonCart.Repository.CartRepository;

@Service
public class CartService {
    @Autowired(required=false)
    CartRepository cartRepository;
//    private final CartRepository cartRepository;
//    public CartService(final CartRepository cartRepository){
//        this.cartRepository = cartRepository;
//    }

    public void addItemToCartService(CartModel cart ){
        cartRepository.save(cart);
    }
    public void removeItemFromCartService(CartModel cart ){
        cartRepository.delete(cart);
    }
    public void displayAllProductsInCart(UUID userId){}
}