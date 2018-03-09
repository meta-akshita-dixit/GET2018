package com.metacube.shoppingcart.dao;

/**
 * this class decides the object of memory type
 * @author Akshita Dixit
 */
public class Factory {
	
	//static object of BaseDao
	private static BaseDao baseDao;
	
	/**
	 * method to get the object 
	 * @param type entity type
	 * @param dbName
	 * @return object
	 */
	public static BaseDao getInstance(EntityType type, Db dbName) {
		
		//checks if the storage type is in memory or not
		if(dbName == Db.IN_MEMORY){
			//object for entity memory dao
			switch(type){
				case PRODUCT : baseDao = new InMemoryProductDao();
							return baseDao;
				case USER : baseDao = new InMemoryUserDao();
							return baseDao;
				case CART : baseDao = new InMemoryCartDao();
							return baseDao;
			}
		}
		//if memory type is not in memory
		return null;	
	}
	/**
	 * private constructor of factory(Singleton class)
	 */
	private Factory() {}
	

}
