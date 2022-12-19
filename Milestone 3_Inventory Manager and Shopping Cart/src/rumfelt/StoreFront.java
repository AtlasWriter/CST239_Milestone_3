/**
 * 
 */
package rumfelt;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel Rumfelt *** Grand Canyon University *** CST239
 * This is a store front which implements a working shopping cart and Inventory System. This application also implements the comparable
 * interfaces in the weapons class. I have also used inheritance as well as a very abstract methods to my the code more reusable. 
 *
 */
public class StoreFront {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		// TODO Auto-generated method stub
		/**
		 * Creating items
		 */
		
		Weapons arr[] = new Weapons[2];
		arr[0] = new Weapons("Machine Gun", "High powered Rifle", 399.99, 12, "Defense/Offense");
		arr[1] = new Weapons("AR15", "American Weapon of War", 1288.77, 10, "Offense");
		Armor armor[] = new Armor[2];
		armor[0] = new Armor("Bullet Proof Vest", "Chain mail that protects from projectiles", 450.30, 4, "Torso");
		armor[1] = new Armor("Scooba Suit", "Under water suite for protection", 1099, 6, "Body");
			
		
		System.out.println("Welcome to Javatopia! Your one stop shope for weapons and armor.");
		System.out.println("Please select from our Menu below:");
		System.out.println("\n");
		
		/**
		 * This is the main menu and driver for my store.
		 */
		
		while(true) {
		System.out.println("Javatopia Store Menu");
		System.out.println("\t1. Weapons" + "\n" + "\t2. Armor" + "\n" + "\t3. View Cart" + "\n" + "\t4. Quit");
		int selection = scan.nextInt();
		int amount;
		int amount2;
		switch(selection) {
			case 1:
			System.out.println("Please select an Item to add to Cart: ");
			Arrays.sort(arr);
			int counter = 0;
			for(int i = 0; i < arr.length; i++) {
				counter++;
				System.out.println(counter + ". " + arr[i]);
			}
			int addToCart = scan.nextInt();
				switch(addToCart) {
					case 1: System.out.println("How many would you like?");
					amount = scan.nextInt();
					cart.addToCart(arr[0]);
					arr[0].setQty(arr[0].getQty() - amount);
					
					System.out.println("Here is you Cart: " + "\n");
					System.out.println("Qty: " + amount);
					cart.showCart();
					break;		
					case 2:
					System.out.println("How many would you like?");
					amount2 = scan.nextInt();
					cart.addToCart(arr[1]);
					arr[1].setQty(arr[1].getQty() - amount2);
					System.out.println("Here is you Cart: " + "\n");
					System.out.println("Qty: " + amount2);
					cart.showCart();
					break;
						
					default : System.out.println("Wrong");
					break;
				}
				break;
			case 2 :
			System.out.println("Please select an Item to add to Cart: ");
			System.out.println("1. " + armor[0]);
			System.out.println("2. " + armor[1]);
			int addToCart1 = scan.nextInt();
			switch(addToCart1) {
				case 1: System.out.println("How many would you like?");
				amount = scan.nextInt();
				cart.addToCart(armor[0]);
				armor[0].setQty(armor[0].getQty() - amount);
				System.out.println("Here is you Cart: " + "\n");
				System.out.println("Qty: " + amount);
				cart.showCart();
				break;	
				
				case 2:
				System.out.println("How many would you like?");
				amount2 = scan.nextInt();
				cart.addToCart(armor[1]);
				armor[1].setQty(armor[1].getQty() - amount2);
				System.out.println("Here is you Cart: " + "\n");
				System.out.println("Qty: " + amount2);
				cart.showCart();
				break;
				
			default : System.out.println("Wrong");
			break;
			
		}
			break;
		case 3 :
			System.out.println("Here is your cart:" + "\n");
			cart.showCart();
			System.out.println("\n");
			System.out.println("What would you like to do? " + "\n");
			System.out.println("\t1. Remove all items from Cart?");
			System.out.println("\t2. Remove an item from the cart?");
			System.out.println("\t3. Purchase Item?");
			int userChoice = scan.nextInt();
			switch(userChoice) {
				case 1 : cart.removeAll();
					System.out.println("Your Cart has been emptied" + "\n");
					break;
				case 2: 
					System.out.println("Here is your Cart:" + "\n");
					cart.showCart();
					System.out.println("Please select the item you wish to remove:" + "\n");
					int priceRemove = scan.nextInt();
					switch(priceRemove) {
					case 1 : cart.removeFromCart(arr[0]);
					break;
					case 2 : cart.removeFromCart(arr[1]);
					break;
					case 3 : cart.removeFromCart(armor[0]);
					break;
					case 4 : cart.removeFromCart(armor[1]);
					break;
					default:
						System.out.println("You did not select any!");
					}
					
					
					
					break;		
				
				case 3 : System.out.println("You are about to purchase the following:");
			  		cart.showCart();
			  		System.out.println("\n");
			  		System.out.println("Press 1 to buy it now or 2 to cancel your order and return to the main menue:" + "\n");
			  		int userPurchase = scan.nextInt();
			  		if(userPurchase == 1) {
			  			cart.removeAll();
			  			System.out.println("Thank you for your Purchase!");
			  		}else {
			  			System.out.println("You have canceled your order:");
			  			cart.removeAll();
			  		}
			  	break;
			  		
			
			}
			break;
			
		
	   	}
		
		
		}
	}
}

		
		
		
		
			
		//while(selection != 4);



