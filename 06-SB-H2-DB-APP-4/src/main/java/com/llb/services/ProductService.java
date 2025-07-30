package com.llb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llb.entities.Product;
import com.llb.repositories.ProductRepo;

@Service
public class ProductService {
	
	private ProductRepo productRepo;

	@Autowired
	public ProductService(ProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}
	
	public void saveProduct() {
		Product product = new Product();
		
		product.setProductname("Mouse");
		product.setProductPrice(100.00);
		
		productRepo.save(product);
		
		System.out.println("Product saved...");
	}

}
