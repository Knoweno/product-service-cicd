package com.knowenobiso.Product.Service.controller;

import com.knowenobiso.Product.Service.dto.ProductRequest;
import com.knowenobiso.Product.Service.dto.ProductResponse;
import com.knowenobiso.Product.Service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor //to inject product service
public class ProductController {
    private  final ProductService productService;
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest); //creating the product by calling the product service
    }
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts()
    {
        return productService.getAllProducts();
    }


}
