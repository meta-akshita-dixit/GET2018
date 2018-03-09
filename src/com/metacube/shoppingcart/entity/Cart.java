package com.metacube.shoppingcart.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * This class sets or gets the cart details.
 * @author Akshita Dixit
 */
public class Cart {
	
	//variable to store user id
	String userId;
	//map to store list of items in cart
	Map<Product, Integer> items = new HashMap<>();
	//variable to store total price/amount of cart
	float totalPrice;
	
	/**
	 * method to get user id
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * method to set user id
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * method to get items in the cart
	 * @return list of items
	 */
	public Map<Product, Integer> getItems() {
		return items;
	}
	
	/**
	 * method to set items 
	 * @param items
	 */
	public void setItems(Map<Product, Integer> items) {
		this.items = items;
	}
	
	/**
	 * method to get total price
	 * @return totalPrice
	 */
	public float getTotalPrice() {
		return totalPrice;
	}
	
	/**
	 * method to set the total price
	 * @param totalPrice
	 */
	public void setTotPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

}
