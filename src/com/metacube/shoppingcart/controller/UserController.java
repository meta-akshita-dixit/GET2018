package com.metacube.shoppingcart.controller;

import java.util.List;
import com.metacube.shoppingcart.dao.Status;
import com.metacube.shoppingcart.entity.User;
import com.metacube.shoppingcart.facade.UserFacade;

/**
 * this class is the controller class for the user entity
 * @author Akshita Dixit
 */
public class UserController {
	
	//object of UserFacade
	UserFacade userFacade = UserFacade.getInstance();
	
	/**
	 * method that calls facade layer method to add a user
	 * @param item - product to be added
	 * @return status
	 */
	public Status add(User item){
			return userFacade.addUser(item);
	}
	
	/**
	 * method that calls facade layer method to fetch the list of users
	 * @return list of users
	 */
	public List<User> getAll(){
			return (List<User>) userFacade.getAll();
	}
	
	/**
	 * method that calls facade layer method to remove user 
	 * @param uid-id of user to be deleted
	 * @return status
	 */
	public Status remove(String uid){
			return userFacade.removeUser(uid);
		}

	/**
	 * method that calls facade layer method to update user details
	 * @param id-id of user
	 * @param name-name of user
	 * @param password-user password
	 * @return status
	 */
	public Status update(String id, String name, String password) {
			return userFacade.updateUser(id,name,password);
		}
	
	
}