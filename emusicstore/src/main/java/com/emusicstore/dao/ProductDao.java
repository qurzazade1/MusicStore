package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.List;


public interface ProductDao {

   

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
    List<Product> getProductList();

    Product getProductById(int id);
}
