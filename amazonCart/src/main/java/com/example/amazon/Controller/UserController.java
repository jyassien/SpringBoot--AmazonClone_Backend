package com.example.amazon.Controller;

import java.util.UUID;

import com.example.amazon.Entity.CartModel;
import com.example.amazon.Services.CartService;
import com.example.amazon.Repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/amazon/addtocart")
public class UserController{

//    private final UserRepo userRepo;
@Autowired
CartService cartService;

// Contructoresa are needed if we are not using @Autowired annotation.
//    private final UserService userService;
//    public UserController(final UserService userService){
//        this.userService = userService;
//    }

    @GetMapping("tryCart")
    public String sayHi(){
        System.out.println("Hi there!");
        return "Hi there!";
    }

    @PostMapping("/add")
    public void addToCart(@RequestBody CartModel cart) {
        cartService.addItemToCartService(cart);
    }

    @DeleteMapping("/remove")
    public void removeFromCart(@RequestBody CartModel cart) {
        cartService.removeItemFromCartService(cart);
    }

    @GetMapping("/show/{userId}")
    public void showItems(@PathVariable("userId") UUID userId) {
        cartService.displayAllProductsInCart(userId);
    }


}