package com.metacube.shoppingcart.facade;

import java.util.Map;
import java.util.Map.Entry;

import com.metacube.shoppingcart.dao.Db;
import com.metacube.shoppingcart.dao.EntityType;
import com.metacube.shoppingcart.dao.Factory;
import com.metacube.shoppingcart.dao.InMemoryCartDao;
import com.metacube.shoppingcart.dao.Status;
import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.entity.Product;

/**
 * This is class that performs all the business logic for cart and shopping entity .
 * @author Akshita Dixit
 *
 */
public class ShoppingFacade {
	
	//static object of Shopping facade
	private static ShoppingFacade obj;
	//memory accessing object
	InMemoryCartDao objectDao =(InMemoryCartDao) Factory.getInstance(EntityType.CART, Db.IN_MEMORY);
	
	/**
	 * method to instantiate the object
	 * @return object of shopping facade
	 */
	public static ShoppingFacade getInstance() {
		if (obj == null) {
			obj = new ShoppingFacade();
		}
		
		return obj;
	}
	
	/**
	 * private constructor to implement singleton class
	 */
	private ShoppingFacade() {}
	
	/**
	 * method to get the list of products in the cart
	 * @param Uid user id
	 * @return list of products
	 */
	public Map<Product, Integer> getList(String Uid){
		Map<Product, Integer> productLists = objectDao.getCart(Uid).getItems();
		return productLists;
	}
	
	/**
	 * method to calculate the total price of the cart
	 * @param Uid-user id 
	 * @return total amount/price
	 */
	public float getTotalPrice (String Uid){
		//list of products in the cart
		Map<Product, Integer> productsList = getList(Uid);
		float total = 0.0f;
		for( Entry<Product, Integer> m: productsList.entrySet()){
			total += (m.getKey().getPrice()*m.getValue());
		}
		return total;
	}

	/**
	 * method to add cart for a user
	 * @param Uid-user id
	 * @param cart-object of cart
	 * @return
	 */
	public Map<Product, Integer> addCart(String Uid, Cart cart) {
		
		if(objectDao.getCart(Uid) == null){
			cart.setUserId(Uid);
			objectDao.addCart(cart);
			return getList(Uid);
		} else {
			return getList(Uid);
		}
			
	}
	
	/**
	 * method to remove the cart for user
	 * @param Uid-user id
	 * @return status
	 */
	public Status removeCart(String Uid) {
		if( objectDao.getCart(Uid) != null ){
			objectDao.removeCart(Uid);
			return Status.CART_DELETED;
		} else {
			return Status.NO_SUCH_USER_FOUND;
		}
	}
	
	/**
	 * method to add product in the cart
	 * @param Uid
	 * @param productId
	 * @param quantity
	 * @return
	 */
	public Status addToCart(String Uid, int productId, int quantity ){
		if(objectDao.getCart(Uid) != null){
			Product pro = ProductFacade.getInstance().getProduct(productId);
			objectDao.addProductToCart(Uid, pro, quantity);
			return Status.UPDATE_SUCCESSFULL;
		} else {
			return Status.ERROR;
		}
	}
	
	/**
	 * method to remove product from cart
	 * @param Uid
	 * @param productId
	 * @return
	 */
	public Status removeFromCart(String Uid, int productId ){
		if(objectDao.getCart(Uid) != null){
			Product pro = ProductFacade.getInstance().getProduct(productId);
			objectDao.removeProductFromCart(Uid, pro);
			return Status.REMOVED_SUCCESSFULY;
		} else {
			return Status.ERROR;
		}
	}

	/**
	 * method to check if the user exists or not
	 * @param uid
	 * @return
	 */
	public boolean checkExistingUser(String uid) {
		return UserFacade.getInstance().checkUser(uid);
	}
}