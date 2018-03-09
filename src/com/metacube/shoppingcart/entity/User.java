package com.metacube.shoppingcart.entity;

/**
 * This class sets or gets the user details like name, id,password etc
 * @author Akshita Dixit
 */
public class User {
	
	//variable to store code of user
	private String uId;
	//variable to store password of user
	private String password;
	//variable to store name of user
	private String name;
	
	/**
	 * constructor to initialize user details
	 * @param uId
	 * @param password
	 * @param name
	 */
	public User(String uId, String password, String name) {
		super();
		this.uId = uId;
		this.password = password;
		this.name = name;
	}

	/**
	 * method to get user id
	 * @return uId
	 */
	public String getUid() {
		return uId;
	}

	/**
	 * method to set user id
	 * @param uId
	 */
	public void setuId(String uId) {
		this.uId = uId;
	}

	/**
	 * method to get password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * method to set password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * method to get name of user
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * method to set users name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
