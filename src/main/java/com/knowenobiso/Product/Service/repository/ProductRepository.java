package com.knowenobiso.Product.Service.repository;

import com.knowenobiso.Product.Service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String>{


}
