package com.CrudOperations.demo1CrudOperations.controller;


import com.CrudOperations.demo1CrudOperations.bean.Product;
import com.CrudOperations.demo1CrudOperations.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    public void addProduct(@RequestBody Product product){

        productService.addProduct(product);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product product){
        productService.updateProduct(id, product);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    public void deleteProduct(@PathVariable String id){

        productService.deleteProduct(id);
    }
}
