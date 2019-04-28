package com.metacube.shoppingcart.controller;

import java.util.Map;

import com.metacube.shoppingcart.dao.Status;
import com.metacube.shoppingcart.entity.Product;
import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.facade.ShoppingFacade;

/**
 * this class is the controller class for the cart entity
 * @author Akshita Dixit
 *
 */
public class CartController {
	
	//object of ShoppingFacade
	ShoppingFacade shopFacade = ShoppingFacade.getInstance();
	
	/**
	 * 
	 * method that calls facade layer method to add a cart for a user
	 * @param uId-user id
	 * @param cart-object of cart type
	 * @return
	 */
	public Map<Product, Integer> newCart(String uId, Cart cart){
		return shopFacade.addCart(uId, cart);
	}
	
	/**
	 * method that calls facade layer method to check if the user exists or not
	 * @param uId -user id
	 * @return boolean
	 */
	public boolean checkExsistingUser(String uId){
		return shopFacade.checkExistingUser(uId);
	}
	
	/**
	 * method that calls facade layer method to fetch the list of products
	 * @param uId-user id
	 * @return list of products
	 */
	public Map<Product, Integer> getList (String uId){
		return shopFacade.getList(uId);
	}
	
	/**
	 * method that calls facade layer method to add product 
	 * @param uId-user id
	 * @param productId-product's id
	 * @param quantity-number of pieces of particular product
	 * @return status
	 */
	public Status addToCart(String uId, int productId, int quantity){
		return shopFacade.addToCart(uId, productId, quantity );
	}
	
	/**
	 * method that calls facade layer method to remove product 
	 * @param uId-user id
	 * @param productId-product's id
	 * @return status
	 */
	public Status removeFromCart(String uId, int productId) {
		return shopFacade.removeFromCart(uId, productId);
	}
	
	/**
	 * method that calls facade layer method to remove cart
	 * @param uId-user id
	 * @return status
	 */
	public Status removeCart(String uId) {
		return shopFacade.removeCart(uId);
	}
	
	/**
	 * method that calls facade layer method to get the total amount
	 * @param uId-user id
	 * @return status
	 */
	public float getTotalPrice(String uId){
		return shopFacade.getTotalPrice(uId);
	}
}