package com.example.amazonCart.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazonCart.Entity.CartModel;
import com.example.amazonCart.Service.CartService;

@RestController
@RequestMapping("/amazon/addtocart")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/add")
    public void addToCart(@RequestBody CartModel cart) {
        cartService.addItemToCartService(cart);
    }

    @DeleteMapping("/remove")
    public void removeFromCart(@RequestBody CartModel cart) {
        cartService.removeItemFromCartService(cart);
    }

    @GetMapping("/show/{userId}")
    public void showItems(@PathVariable UUID userId) {
        cartService.displayAllProductsInCart(userId);
    }
    @GetMapping("/trycart")
    public String tryCart(){
        System.out.println("Cart is Successfully linked");
        return "Cart is Successfully linked";
    }
}