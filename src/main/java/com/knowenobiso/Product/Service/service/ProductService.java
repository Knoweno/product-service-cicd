package com.knowenobiso.Product.Service.service;

import com.knowenobiso.Product.Service.dto.ProductRequest;
import com.knowenobiso.Product.Service.dto.ProductResponse;
import com.knowenobiso.Product.Service.model.Product;
import com.knowenobiso.Product.Service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //lombok will generate all required constructors for us
@Slf4j //for adding logs. Lombok
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        //to build the product object
        Product product= Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product); //saving the product to the database
       // log.info("Product "+product.getId()+ "is saved"); //
        log.info("Product {} is saved", product.getId()); // we can also use place holders to handle the product id
   //We then call the createProduct from the controller
    }


    public List<ProductResponse>getAllProducts() {
        List<Product> products = productRepository.findAll();
//        List<ProductResponse> list = products.stream().map(product -> mapToProductResponse(product)).toList();
//        return list;
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
