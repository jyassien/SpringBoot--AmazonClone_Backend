package com.example.amazonProduct.Repository;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.amazonProduct.Entity.ProductModel;

@Repository
public interface ProductRepo extends MongoRepository<ProductModel, BigInteger> {

    ProductModel save(ProductModel product);
    ArrayList<ProductModel> findAll();
    ProductModel findByproductID(UUID productId);
}




//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.UUID;
//
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
//
//import com.example.amazonProduct.Entity.ProductModel;
//
//@Repository
//public interface ProductRepo extends MongoRepository<ProductModel, BigInteger> {
//
//    ProductModel save(ProductModel product );
//    ArrayList<ProductModel> findAll();
//    ProductModel findByProductId(UUID productID);
//
//}
