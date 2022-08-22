package com.example.amazon.Repository;

import com.example.amazon.Entity.CartModel;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
//@Service
public interface CartRepository extends CrudRepository<CartModel, Long>{
    CartModel save(CartModel cart);
    void delete(CartModel cart);
    ArrayList<CartModel> findByuserId(UUID userId);
}
