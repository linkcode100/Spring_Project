package com.javatechkie.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechkie.demo.entity.Product;
import com.javatechkie.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	//ProductService class will talk to ProductRepository so we need to inject repository using autowired
	@Autowired
	private ProductRepository repository;  //create object of ProductRepository class
	
	
	//post methods to save product object to database
		public Product saveProduct(Product product) {
	        return repository.save(product);
	    }

	    public List<Product> saveProducts(List<Product> products) {
	        return repository.saveAll(products);
	    }

	    //get methods
	    public List<Product> getProducts() {
	        return repository.findAll();
	    }

	    public Product getProductById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Product getProductByName(String name) {
	        return repository.findByName(name);
	    }

	   
	    //delete method
	    public String deleteProduct(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }

	   
	    //there is no inbuilt method to update in spring data jpa -> use set methods
	    public Product updateProduct(Product product) {
	        Product existingProduct = repository.findById(product.getId()).orElse(null);
	        existingProduct.setName(product.getName());
	        existingProduct.setQuantity(product.getQuantity());
	        existingProduct.setPrice(product.getPrice());
	        return repository.save(existingProduct);
	    }


}
