package com.CrudOperations.demo1CrudOperations.service;

import com.CrudOperations.demo1CrudOperations.bean.Product;
import com.CrudOperations.demo1CrudOperations.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }
    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(String id, Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
