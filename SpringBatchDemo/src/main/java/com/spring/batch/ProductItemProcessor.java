package com.spring.batch;

import org.springframework.batch.item.ItemProcessor;

import com.spring.batch.entity.Product;

public class ProductItemProcessor implements ItemProcessor<Product, Product> {

	public Product process(Product product) throws Exception {
		System.out.println("Processing item " + product);
		return product;
	}

}
