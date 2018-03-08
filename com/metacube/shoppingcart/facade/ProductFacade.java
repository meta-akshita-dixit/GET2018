package com.metacube.shoppingcart.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.metacube.shoppingcart.dao.Db;
import com.metacube.shoppingcart.dao.InMemoryDao;
import com.metacube.shoppingcart.dao.ProductFactory;
import com.metacube.shoppingcart.dao.Status;
import com.metacube.shoppingcart.entity.Product;

/**
 * This is class that performs all the business logic .
 * @author Akshita Dixit
 *
 */
public class ProductFacade {

	//static object of the class
	private static ProductFacade obj;
		
	InMemoryDao inMemoryDao = (InMemoryDao) ProductFactory.getInstance(Db.IN_MEMORY);
	
	/**
	 * this method is used to return the object of this class
	 * @return - object of this class (singleton class)
	 */
	public static ProductFacade getInstance() {
		if (obj == null) {
			obj = new ProductFacade();
		}
		
		return obj;
	}
	
	/**
	 * private constructor to restrict creating object using new keyword
	 */
	private ProductFacade() {}
	
	/**
	 * this method returns the list of products came from inmemory storage
	 * @return - list of products
	 */
	public List<Product> getAll(){
		List<Product> lists = new ArrayList<>();
		for(Entry<Integer, Product> e: inMemoryDao.getAll().entrySet()){
			lists.add((Product)e.getValue());
		}
		return lists;
	}

	/**
	 * this method returns status of product after performing add operation
	 * @param product - product object
	 * @return - status of added product
	 */
	public Status addProduct(Product product) {
		return inMemoryDao.addProduct(product);
	}
	
	/**
	 * this method returns status of product after performing remove operation
	 * @param productId - id of product
	 * @return - status of product either removed or error
	 */
	public Status removeProduct(int productId) {
		if( inMemoryDao.getAll().containsKey(productId) ){
			inMemoryDao.removeProduct(productId);;
			return Status.PRODUCT_REMOVED;
		} else {
			return Status.PRODUCT_NOT_FOUND;
		}
	}
	
	/**
	 * this method returns status of product after performing update operation
	 * @param productId - id of product
	 * @param productName - name of product
	 * @param price - price of product
	 * @return - status of product either update successful or error
	 */
	public Status updateProduct(int productId, String productName, float price ){
		if(inMemoryDao.getAll().containsKey(productId)){
			inMemoryDao.updateProduct(productId, productName, price);
			return Status.UPDATE_SUCCESSFULL;
		} else {
			return Status.PRODUCT_NOT_FOUND;
		}
	}
}
