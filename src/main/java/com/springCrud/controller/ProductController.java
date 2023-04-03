package com.springCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springCrud.entity.Product;
import com.springCrud.service.ProductService;

@RestController
@RequestMapping("/app")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//Mapping for get the data
	@GetMapping("/products") //set url for Get Mapping
	public List<Product> list(){
		return productService.listAllProduct();
	}
	
	//mapping for save data in database
	@PostMapping("/postProduct") //set url for post Mapping
	public void addProduct(@RequestBody Product product) {
		productService.save(product);
	}
	
	//mapping for update data in database
	@PutMapping("/update/{id}") //set url for put Mapping
	public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Long id){
		productService.save(product);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//Mapping for delete data from database
	@DeleteMapping("/delete/{id}") //set url for delete Mapping
	public void deleteData(@PathVariable Long id) {
		productService.delete(id);
	}

}
