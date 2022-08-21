package com.example.amazonCart.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.amazonCart.Entity.CartModel;

@Repository
public interface CartRepository extends CrudRepository<CartModel, Long>{

    CartModel save(CartModel cart);
    void delete(CartModel cart);
    ArrayList<CartModel> findByuserId(UUID userId);

}
