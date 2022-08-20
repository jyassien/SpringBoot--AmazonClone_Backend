package com.example.amazonProduct.Controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;
import com.example.amazonProduct.Entity.ProductModel;
import com.example.amazonProduct.Service.ProductService;


@RestController
@RequestMapping("/amazon/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/try")
    public String tryProduct() {
        System.out.println("Successfull trial.");
        return "Successfull trial.";
    }
    @PostMapping("/save")
    public ProductModel saveData(@RequestBody ProductModel product) {
        return productService.saveDataToDB(product);
    }

    @GetMapping("/getAllProducts")
    public ArrayList<ProductModel> getAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/search/{productId}")
    public ProductModel getProductById(@PathVariable UUID productId) {
        return productService.getProductDetails(productId);
    }
}
