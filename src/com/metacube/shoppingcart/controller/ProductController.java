package com.metacube.shoppingcart.controller;

import java.util.List;
import com.metacube.shoppingcart.dao.Status;
import com.metacube.shoppingcart.entity.Product;
import com.metacube.shoppingcart.facade.ProductFacade;

/**
 * this class is the controller class for the product entity
 * @author Akshita Dixit
 *
 */
public class ProductController {
	
	ProductFacade productFacade = ProductFacade.getInstance();
	
	/**
	 * method that calls facade layer method to add a product
	 * @param item - product to be added
	 * @return status
	 */
	public Status add(Product item){
		return productFacade.addProduct(item);
	}
	
	/**
	 * method that calls facade layer method to fetch the list of products
	 * @return list of products
	 */
	public List<Product> getAll(){
		
			return (List<Product>) productFacade.getAll();	
	}
	
	/**
	 * method that calls facade layer method to remove product 
	 * @param id-id of product to be deleted
	 * @return status
	 */
	public Status remove(int id){
		
		return productFacade.removeProduct(id);
	}

	/**
	 * method that calls facade layer method to update product details
	 * @param id
	 * @param name
	 * @param price
	 * @return status
	 */
	public Status update(int id, String name, float price) {
		
			return productFacade.updateProduct(id, name, price);
		
	}

}
