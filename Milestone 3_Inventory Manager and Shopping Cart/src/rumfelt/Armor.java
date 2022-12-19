/**
 * 
 */
package rumfelt;

/**
 * @author Daniel Rumfelt *** Grand Canyon University *** CST239
 * This is a store front which implements a working shopping cart and Inventory System. This application also implements the comparable
 * interfaces in the weapons class. I have also used inheritance as well as a very abstract methods to my the code more reusable. 
 *
 */
public class Armor extends InventoryManager{
	
	private String areaProtection;

	/**
	 * @param itemName
	 * @param description
	 * @param d
	 * @param qty
	 * @param areaProtection
	 */
	public Armor(String itemName, String description, double d, int qty, String areaProtection) {
		super(itemName, description, d, qty);
		this.areaProtection = areaProtection;
	}

	@Override
	public String toString() {
		return "Item: " + this.getItemName() + "\n"
				+ "Description: " + this.getDescription() + "\n" + "Price: " + this.getPrice() + "\n" + "Qty: "
				+ this.getQty() + "\n" + "Protection Area: " + this.areaProtection + "\n" + "**************************" + "\n";
	}
	
	

}
