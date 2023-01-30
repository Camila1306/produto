package com.rsh.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rsh.models.ProductList;
import com.rsh.services.ProductListService;



@RestController
public class ProductListController {
	
	@Autowired
	private ProductListService service; 
	
	private List<ProductList> productsList = Arrays.asList(
			new ProductList("Camisa", "Lacost"), 
			new ProductList("Calça", "Beagle" )
			);
	
	
	public List<ProductList> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<ProductList> productsList) {
		this.productsList = productsList;
	}

	public ProductListController(ProductListService service, List<ProductList> products) {
		this.service = service;
		productsList = products;
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/produto")
	public void deleteProduct(@RequestBody ProductList Product) {
		this.service.deleteProductList(Product.getProductId());
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/produtos")
	public void addProduct(@RequestBody ProductList Product) {
		 this.service.addProduct(Product); 
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/produto/{produtoId}")
	public ProductList getProduct(@PathVariable int ProductId) {
		return this.service.getProductById(ProductId); 
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/produtos")
	public List<ProductList> getProducts() {
		
		return this.service.getAllProducts();
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World"; 
	}
	
}

