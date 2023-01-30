package com.rsh.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsh.models.ProductList;
import com.rsh.repository.ProductListRepository;

@Service 
public class ProductListService {
	
	@Autowired
	private ProductListRepository repository; 

	private List<ProductList> productLists;
	
	public ProductListService() {
		
		this.productLists = new ArrayList<ProductList>(); 
		
		this.productLists.add(new ProductList(1,"Camisa", 15, "Lacost")); 
		this.productLists.add(new ProductList(2,"Calça", 500, "Beagle"));
		this.productLists.add(new ProductList(3,"Shorts", 200, "Colcci")); 
		
	} 
	
	public void deleteProductList(int productListId) {
		
		ProductList productList = this.repository.findById(productListId).get();
		this.repository.delete(productList);

	}
	
	public void updateProductList(ProductList productList) {
		
		ProductList persistedProductList = getProductListById(productList.getProductId());
		persistedProductList.setNome(productList.getNome());
		this.repository.save(persistedProductList);
	}
	
	public void addProduct(ProductList productList) {
		this.repository.save(productList);
	}
	
	public ProductList getProductListById(int productListId) {
		
		return this.repository.findById(productListId).get();	
	}

	public List<ProductList> getAllProductLists() {
		
		List<ProductList> productLists = new ArrayList<>(); 
		this.repository.findAll()
		.forEach(productLists::add);
		
		return productLists; 
		
		//return this.productLists; 
	}

  public ProductList getProductById(int productId) {
    return null;
  }

  public List<ProductList> getAllProducts() {
    return null;
  }
	
	
}

