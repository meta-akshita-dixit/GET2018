package com.metacube.shoppingcart.dao;

import java.util.HashMap;
import java.util.Map;
import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.entity.Product;

/**
 * This class performs basic function for inmemory storage for product
 * @author Akshita Dixit
 */
public class InMemoryCartDao implements BaseDao {
	
	//this stores all the cart in map format
	Map<String , Cart> allCarts = new HashMap<>();

	/**
	 * method to get cart
	 * @param userId-cart of user having this user id
	 * @return
	 */
	public Cart getCart(String userId) {
		return this.allCarts.get(userId);
	}
	
	/**
	 * method to get details of all carts
	 * @return all carts
	 */
	public Map<String, Cart> getAllCart() {
		return this.allCarts;
	}

	/**
	 * method to add cart
	 * @param cart
	 */
	public void addCart(Cart cart) {
		this.allCarts.put(cart.getUserId(), cart);
		
	}
	
	/**
	 * method to remove cart 
	 * @param userId-cart of this user to be removed
	 */
	public void removeCart(String userId) {
		allCarts.remove(userId);
	}

	/**
	 * method to add product in the cart
	 * @param userId
	 * @param product
	 * @param quantity
	 */
	public void addProductToCart(String userId, Product product, int quantity) {
		Cart cart = getCart(userId);
		Map<Product, Integer> itemsList = cart.getItems();
		itemsList.put(product, quantity);
		cart.setItems(itemsList);
	}

	/**
	 * method to remove product from cart
	 * @param uId
	 * @param product
	 */
	public void removeProductFromCart(String uId, Product product) {
		Cart cart = getCart(uId);
		Map<Product, Integer> itemsList = cart.getItems();
		itemsList.remove(product);
		cart.setItems(itemsList);
	}
}