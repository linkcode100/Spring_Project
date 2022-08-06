package com.javatechkie.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechkie.demo.entity.Product;
import com.javatechkie.demo.service.ProductService;

//annotate 
@RestController
public class ProductController {
	
	//this will talk to service ProductService class
	@Autowired
	private ProductService service;
	
	//write restend points for all methods present in service
	
	

	  //post method
	//@PostMapping -> for post Api
	//@RequestBody so that input json can be parsed to this Product object
	  @PostMapping("/addProduct")  //give url
	    public Product addProduct(@RequestBody Product product) {
	        return service.saveProduct(product);
	    }

	    @PostMapping("/addProducts")
	    public List<Product> addProducts(@RequestBody List<Product> products) {
	        return service.saveProducts(products);
	    }
	    
	    
        
	    @GetMapping("/products")
	    public List<Product> findAllProducts() {
	        return service.getProducts();
	    }

	    //@PathVariable-> we need to pass id field as the part of request url ->also can use @RequestParameter
	    @GetMapping("/productById/{id}")
	    public Product findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

	    @GetMapping("/product/{name}")
	    public Product findProductByName(@PathVariable String name) {
	        return service.getProductByName(name);
	    }

	    @PutMapping("/update")
	    public Product updateProduct(@RequestBody Product product) {
	        return service.updateProduct(product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }
	}
