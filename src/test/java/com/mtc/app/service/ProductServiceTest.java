package com.mtc.app.service;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mtc.app.entity.Product;
import com.mtc.app.repository.IProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
	
	@Mock
	IProductRepository productRepository;
	
	@InjectMocks
	ProductService productService;

	@Test
	public void testGetProductById() {
		
		Optional<Product> optional = Optional.of(new Product(1,"iPhone",200,"Product Desc",20));
		
		when(productRepository.findById(1)).thenReturn(optional);
		
		Assert.assertEquals("iPhone",productService.getProductById(1).getName());	
		
	}

}
