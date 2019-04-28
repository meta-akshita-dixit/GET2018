package com.metacube.shoppingcart.dao;

import java.util.HashMap;
import java.util.Map;
import com.metacube.shoppingcart.entity.User;

/**
 * This class performs basic function for inmemory storage for user
 * @author Akshita Dixit
 */
public class InMemoryUserDao implements BaseDao {
	
	//this stores all the users in map format
	Map<String, User> allUsers = new HashMap<>();
	
	/**
	 * this method returns list of users
	 * @return list of users
	 */
	public Map<String, User> getAll() {
		return this.allUsers;
	}

	/**
	 * this method adds user
	 * @param user-object of user class
	 */
	public void addUser(User user) {
		this.allUsers.put(user.getUid(), user);
	}

	/**
	 * this method removes user from list
	 * @param uid
	 */
	public void removeUser(String uid) {
		allUsers.remove(uid);
		
	}

	/**
	 * method updates user details
	 * @param userId
	 * @param userName
	 * @param password
	 */
	public void updateUser(String userId, String userName, String password) {
		User user = allUsers.get(userId);
		user.setName(userName);
		user.setPassword(password);
	}

}
