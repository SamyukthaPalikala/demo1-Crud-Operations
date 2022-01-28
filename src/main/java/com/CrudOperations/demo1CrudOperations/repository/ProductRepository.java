package com.CrudOperations.demo1CrudOperations.repository;

import com.CrudOperations.demo1CrudOperations.bean.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
