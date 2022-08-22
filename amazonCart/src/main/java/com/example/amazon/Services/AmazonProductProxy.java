package com.example.amazon.Services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.amazon.Entity.ProductModel;

@FeignClient(name="amazon-product", url="localhost:8082")
public interface AmazonProductProxy{

    @GetMapping("/search/{productId}")
    public ProductModel getProductById(@PathVariable UUID productId);
}
