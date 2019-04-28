package com.metacube.shoppingcart.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.metacube.shoppingcart.dao.Db;
import com.metacube.shoppingcart.dao.EntityType;
import com.metacube.shoppingcart.dao.Factory;
import com.metacube.shoppingcart.dao.InMemoryUserDao;
import com.metacube.shoppingcart.dao.Status;
import com.metacube.shoppingcart.entity.User;

/**
 * This is class that performs all the business logic for user entity .
 * @author Akshita Dixit
 *
 */
public class UserFacade {
	private static UserFacade obj;
	
	InMemoryUserDao inMemoryUserDao =(InMemoryUserDao) Factory.getInstance(EntityType.USER, Db.IN_MEMORY);
	/**
	 * this method is used to return the object of this class
	 * @return - object of this class (singleton class)
	 */
	public static UserFacade getInstance() {
		if (obj == null) {
			obj = new UserFacade();
		}
		
		return obj;
	}
	
	/**
	 * private constructor to restrict creating object using new keyword
	 */
	private UserFacade() {}
	
	/**
	 * this method returns the list of products came from inmemory storage
	 * @return - list of users
	 */
	public List<User> getAll()
	{
		List<User> usersList = new ArrayList<>();
		for(Entry<String, User> e: inMemoryUserDao.getAll().entrySet()){
			usersList.add((User)e.getValue());
		}
		return usersList;
		
	}
	
	public Status addUser(User user)
	{
		if(!inMemoryUserDao.getAll().containsKey(user.getUid())){
			inMemoryUserDao.addUser(user);
			return Status.USER_ADDED;
		} else {
			return Status.USER_ALREADY_EXISTS;
		}
	}
	
	 public boolean checkUser(String uid){
	    	return inMemoryUserDao.getAll().containsKey(uid);
	    }
	
	 public Status removeUser(String userId) {
			if( inMemoryUserDao.getAll().containsKey(userId) ){
				inMemoryUserDao.removeUser(userId);
				return Status.USER_DELETED;
			} else {
				return Status.NO_SUCH_USER_FOUND;
			}
		}
		
		public Status updateUser(String userId, String userName, String password ){
			if(inMemoryUserDao.getAll().containsKey(userId)){
				inMemoryUserDao.updateUser(userId, userName, password);
				return Status.UPDATE_SUCCESSFULL;
			} else {
				return Status.NO_SUCH_USER_FOUND;
			}
		}
}
