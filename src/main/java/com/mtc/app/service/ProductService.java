package com.mtc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtc.app.entity.Product;
import com.mtc.app.repository.IProductRepository;

@Service("productService")
public class ProductService implements IProductService{

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public Product getProductById(int id) {

		return productRepository.findById(id).get();
	}
	
	

}
