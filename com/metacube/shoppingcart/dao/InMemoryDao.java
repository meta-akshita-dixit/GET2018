package com.metacube.shoppingcart.dao;

import java.util.HashMap;
import java.util.Map;

import com.metacube.shoppingcart.entity.Product;

/**
 * This class performs basic function for inmemory storage
 * @author Akshita Dixit
 *
 */
public class InMemoryDao implements BaseDao {
	
		//this stores all the product in map format
		Map<Integer, Product> allProducts = new HashMap<>();
	
		/**
		 * this method returns list of products
		 * @return map containing list of products
		 */
		public Map<Integer, Product> getAll() {
			return this.allProducts;
		}
	
		/**
		 * this method adds product in the list
		 * @param product object of product type
		 * @return status
		 */
		public Status addProduct(Product product) {
			this.allProducts.put(product.getProductCode(), product);
			return Status.PRODUCT_ADDED;
			
		}
		
		/**
		 * this method removes the product from the list of products
		 * @param productId - id of product to be deleted
		 */
		public void removeProduct(int productId) {
			allProducts.remove(productId);
		}
	
		/**
		 * this method updates the details of the product
		 * @param productId
		 * @param productName
		 * @param price
		 */
		public void updateProduct(int productId, String productName, float price) {
			Product product = allProducts.get(productId);
			product.setProductName(productName);
			product.setPrice(price);
		}
}
		

