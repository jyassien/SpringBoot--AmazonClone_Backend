package com.example.amazon.Entity;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


public class ProductModel {

    @Getter @Setter
    public BigInteger id;

    public UUID productID;
    public String name;
    public double price;
    public double rating;
    public String imageURL;
}
