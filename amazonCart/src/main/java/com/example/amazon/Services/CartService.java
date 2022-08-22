package com.example.amazon.Services;

import java.util.UUID;
import java.util.ArrayList;

import com.example.amazon.Entity.CartModel;
import com.example.amazon.Entity.ProductModel;
import com.example.amazon.Entity.CartDetails;
import com.example.amazon.Services.AmazonProductProxy;

import com.example.amazon.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    AmazonProductProxy amazonProductProxy;

    public void addItemToCartService(CartModel cart ){
        cartRepository.save(cart);
    }
    public void removeItemFromCartService(CartModel cart ){
        cartRepository.delete(cart);
    }
    public CartDetails displayAllProductsInCart(UUID userId){
        CartDetails cartDetails = new CartDetails();
        cartDetails.setUserId(userId);

       ArrayList<CartModel> cartList =  cartRepository.findAllByUserId(userId);
       ArrayList<ProductModel> productList = new ArrayList<ProductModel>();

       fro(int i = 0; i < cartList.size(); i++){
           ProductModel product = amazonProductProxy.getProductById(cartList.get(i).getProductId());
           productList.add(product );
        }

        cartDetails.setList(productList);

       return cartDetails;
    }

    }

