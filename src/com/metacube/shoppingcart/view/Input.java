package com.metacube.shoppingcart.view;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.metacube.shoppingcart.controller.CartController;
import com.metacube.shoppingcart.controller.ProductController;
import com.metacube.shoppingcart.controller.UserController;

import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.entity.Product;
import com.metacube.shoppingcart.entity.User;

/**
 * This class works as a UI for the user to get the input from it.
 * @author Akshita Dixit
 */
public class Input {
	    
	//variable of scanner class
	static Scanner input  = new Scanner(System.in);
	//object of ProductController
	ProductController productController = new ProductController();
	//object of UserController
	UserController userControl = new UserController();
	//object of CartController
	CartController cartControl = new CartController();
	
	/**
	 * this method provides menu for the user and performs required operation
	 */
	public void takeInput(){
		//variable to get the choice from user
		int choice;
		do{
			//menu options
			System.out.println("***Menu***");
			System.out.println("1. Add Product");
			System.out.println("2. Delete Product");
			System.out.println("3. Update Product");
			System.out.println("4. Show Products");
			System.out.println("5. Add User");
			System.out.println("6. Delete User");
			System.out.println("7. Update User");
			System.out.println("8. Show Users");
			System.out.println("9. Shop");
			System.out.println("10. Exit");
			System.out.println("Enter ur choice");
			choice = input.nextInt();
			switch(choice) {
				//Add Product
				case 1: 
					System.out.println("Enter name and Price of new Product");
					String name = input.next();
					float price = input.nextFloat();
					Product product = new Product(name,price);
					System.out.println(productController.add(product));
					break;
				// Delete Product
				case 2: 
					int id = input.nextInt();
					System.out.println(productController.remove(id));
					break;
				//Update Product
				case 3:
					System.out.println("Enter id of the product to be upated");
					id = input.nextInt();
					System.out.println("Enter new name and Price of the Product to be updated");
					name = input.next();
					price = input.nextFloat();
					System.out.println(productController.update(id,name,price));
					break;
				//Show Users
				case 4: 
					for(Object obj: productController.getAll()){
						Product s = (Product)obj;
						System.out.println("Id= "+s.getProductCode()+" name= "+s.getProductName()+" price= "+s.getPrice());
					}
					break;
				//Add User
				case 5: 
					System.out.println("Enter UserID, UserName and Password of new User");
					String uid = input.next();
					name = input.next();
					String password = input.next();
					User user = new User(uid,name,password);
					System.out.println(userControl.add(user));
					break;
				//Remove User
				case 6: 
					uid = input.next();
					System.out.println(userControl.remove(uid));
					break;
				//Update User
				case 7:
					System.out.println("Enter UserID of the user to be upated");
					uid = input.next();
					System.out.println("Enter new name and password of the user to be updated");
					name = input.next();
					password = input.next();
					System.out.println(userControl.update(uid,name,password));
					break;
				//Show Users
				case 8: 
					for(Object obj: userControl.getAll()){
						User s = (User)obj;
						System.out.println("UserId= "+s.getUid()+" Username= "+s.getName()+" Password = "+s.getPassword());
					}
					break;
				//Shop now
				case 9:
					System.out.println("Enter UserID");
					uid = input.next();
					if(cartControl.checkExsistingUser(uid)){
						shopping(uid);
					} else {
						System.out.println("User id not found");
					}
					break;
				//exit
				case 10:
					System.exit(0);
					break;
				default:
					System.out.println("Please enter a valid option");
			}
		}while(true);
	}
	
	/**
	 * this method performs the operations to shop
	 * @param uid-user id for the user who is shopping
	 */
	private void shopping(String uid) {
		int choice,quantity;
		int pid;
		String user=uid;
		//object of cart to store items
		Cart cart = new Cart();
		//calling new cart from controller object
		cartControl.newCart(uid, cart);
		do{
			//initial cart status
			System.out.println("Your cart:");
			//diaplay cart
			if(cartControl.getList(user).size() > 0 ){
			displayCart(cartControl.getList(user));
			//total price of cart
			System.out.println("\t\t\t\t\t\t\tTotal Price="+cartControl.getTotalPrice(uid));
			} else {
				System.out.println("No product");
			}
			//menu
			System.out.println("1.Add/Update product");
			System.out.println("2.Remove product");
			System.out.println("3.Checkout");
			choice = input.nextInt();
			switch(choice){
			//Add/Update product
			case 1:
				for(Product obj: productController.getAll()){
					Product s = obj;
					System.out.println("Id= "+s.getProductCode()+" name= "+s.getProductName()+" price= "+s.getPrice());
				}
				System.out.println("Enter product id and quantity");
				pid = input.nextInt();
				quantity = input.nextInt();
				System.out.println(cartControl.addToCart(user, pid, quantity));
				break;
			//.Remove product
			case 2:
				System.out.println("Enter product id to be removed");
				pid = input.nextInt();
				System.out.println(cartControl.removeFromCart(uid, pid));
				break;
			//Checkout
			case 3:
				cartControl.removeCart(uid);
				return;
			default:
				System.out.println("Enter valid choice");
			}
		} while(true);
		
		
	}
	/**
	 * method to display cart
	 * @param list
	 */
	private void displayCart(Map<Product, Integer> list) {
		int count = 0;
		System.out.println("SlNo.\t\tName\t\tPrice\t\tQuantity");
		for(Entry<Product, Integer> m : list.entrySet()){
			System.out.println((count++) + "\t\t" +m.getKey().getProductName()+ "\t\t" +m.getKey().getPrice()+ "\t\t" +m.getValue());
		}
		
	}
}
