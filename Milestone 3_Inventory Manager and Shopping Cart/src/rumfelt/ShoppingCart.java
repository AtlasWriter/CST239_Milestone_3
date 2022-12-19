/**
 * 
 */
package rumfelt;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Daniel Rumfelt *** Grand Canyon University *** CST239
 * This is a store front which implements a working shopping cart and Inventory System. This application also implements the comparable
 * interfaces in the weapons class. I have also used inheritance as well as a very abstract methods to my the code more reusable. 
 *
 */
public class ShoppingCart{
	
	/**
	 * Create a shopping cart to storm the list in item.
	 */
	ArrayList<InventoryManager> item;



	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		super();
		this.item = new ArrayList<InventoryManager>();
	}
	/**
	 * Add a item to the cart
	 * 
	 * @param item
	 */

	public void addToCart(InventoryManager item) {
		this.item.add(item);
	}
	/**
	 * Show cart to customer.
	 */
	
	public void showCart(){
		ListIterator<InventoryManager> iterator = item.listIterator();
		while(iterator.hasNext()) {
			InventoryManager item1 = iterator.next();
			System.out.println(item1);
		}
		
		/**
		 * Remove a specific item from the cart.
		 */
	}
	public void removeFromCart(InventoryManager i) {
		ListIterator<InventoryManager> iterator1 = item.listIterator();
		while(iterator1.hasNext()) {
			InventoryManager item2 = iterator1.next();
			if(item2.getItemName().equals(i.getItemName())) {
				this.item.remove(i);
				break;
			}
	}
	}
	/**
	 * Remove entire shopping Cart
	 */
	
	public void removeAll() {
		this.item.clear();
		
		
	}
	

	@Override
	public String toString() {
		return ". Cart" + this.item;
	}

	

	

}
