package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.entity.Product;
import com.mtc.app.repository.IProductRepository;

@RestController
@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner{
	
	@Autowired
	IProductRepository productRepository;
	
	 @RequestMapping("/hello")
	 public String home() {
	        return "Hello Docker World";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		productRepository.save(new Product("Copper Bottle", 400, "Water Bottle",50));
		productRepository.save(new Product("iPhone7", 450, "IPhone",60));
		productRepository.save(new Product("Note5", 350, "Redmi",80));
		productRepository.save(new Product("Vivo v7", 300, "Smart",40));
		
	}
}
