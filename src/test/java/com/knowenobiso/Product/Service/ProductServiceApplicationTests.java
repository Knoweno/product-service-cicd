package com.knowenobiso.Product.Service;

import com.knowenobiso.Product.Service.dto.ProductRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {/*
	@Container //JUnit will understand that this  is a MongoDB container
	static MongoDBContainer mongoDBContainer =new MongoDBContainer("mongo:4.4.2"); //mongo version to use.
	//static MongoDBContainer =new MongoDBContainer();
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;
	@DynamicPropertySource
	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
	dynamicPropertyRegistry.add("spring.data.mongodb.uri",mongoDBContainer::getReplicaSetUrl);

}
	@Test
//	void contextLoads() {
//	}
	void shouldCreateProduct() throws Exception {
		ProductRequest productRequest=  getProductRequest();
		String productRequestString = objectMapper.writeValueAsString(productRequest);
mockMvc.perform(MockMvcRequestBuilders.post("/api/product/AllProducts")
		.contentType(MediaType.APPLICATION_JSON)
		.content(productRequestString))
		.andExpect(status().isCreated());

	}

	private ProductRequest getProductRequest() {
		return ProductRequest.builder()
				.name("HP Laptop")
				.description("HP Laptop")
				.price(BigDecimal.valueOf(6500.35))
				.build();
	}

*/
}
