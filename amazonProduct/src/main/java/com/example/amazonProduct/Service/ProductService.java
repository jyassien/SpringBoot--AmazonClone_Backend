package com.example.amazonProduct.Service;


import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amazonProduct.Entity.ProductModel;
import com.example.amazonProduct.Repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public ProductModel saveDataToDB(ProductModel product) {

        product.setProductID(UUID.randomUUID());
        return productRepo.save(product);
    }

    public ArrayList<ProductModel> findAllProducts() {
        return productRepo.findAll();
    }

    public ProductModel getProductDetails(UUID productId) {
        return productRepo.findByproductID(productId);
    }

}




//import java.util.ArrayList;
//import java.util.UUID;
//
//import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.example.amazonProduct.Entity.ProductModel;
//import com.example.amazonProduct.Repository.ProductRepo;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    ProductRepo productRepo;
//
////    public ProductService(ProductRepo productRepo) {
////        this.productRepo = productRepo;
////    }
//
//    public ProductModel saveDataToDB(ProductModel product ){
//        ProductModel newProduct = productRepo.save(product );
//        return newProduct;
//    }
//    public ArrayList<ProductModel> findAllProducts(){
//        return productRepo.findAll();
//    }
//    public ProductModel getProductDetails(UUID productID){
//        return productRepo.findByproductID(productId);
//    }
//}
