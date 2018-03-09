package com.metacube.shoppingcart.main;

import com.metacube.shoppingcart.view.Input;

/**
 * this is the main class to that invokes the input class
 * @author Akshita Dixit
 *
 */
public class MainClass {
	
	/**
	 * main method that creates object of class input
	 * @param args
	 */
	public static void main(String[] args){
		Input shop = new Input();
		shop.takeInput();
	}

}
