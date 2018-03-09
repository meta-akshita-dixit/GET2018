package com.metacube.shoppingcart.entity;

/**
 * This class sets or gets the product entities like name, id, price etc
 * @author Akshita Dixit
 *
 */
public class Product {
	
	//variable to store code of product
	private int productCode;
	//variable to store name of product
	private String productName;
	//variable to store price of product
	private float price;
	//variable to generate code of product
	private static int count = 1;
	
	/**
	 * constructor to initialize the product details
	 * @param productName
	 * @param price
	 */
	public Product(String productName, float price) {
		
		this.productName = productName;
		this.price = price;
		this.productCode = count++;
	}

	/**
	 * method to get the product code
	 * @return productCode
	 */
	public int getProductCode() {
		return productCode;
	}

	/**
	 * method to set the product code
	 * @param productCode
	 */
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	/**
	 * method to get the product name
	 * @return productCode
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * method to set the product name
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * method to get the product price 
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * method to set the product price 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
