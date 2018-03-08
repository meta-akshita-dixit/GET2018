package com.metacube.shoppingcart.dao;

import java.util.Map;

import com.metacube.shoppingcart.entity.Product;

/**
 * This interface is used for getting the instance of storage type 
 * @author Akshita Dixit
 *
 */
public interface BaseDao {
	
	public Map<Integer, Product> getAll();
	
	public Status addProduct(Product product);
	
	public void removeProduct(int productId);
	
	public void updateProduct(int productId, String productName, float price);

}
