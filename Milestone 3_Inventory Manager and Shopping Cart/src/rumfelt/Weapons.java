package rumfelt;

/**
 * @author Daniel Rumfelt *** Grand Canyon University *** CST239
 * This is a store front which implements a working shopping cart and Inventory System. This application also implements the comparable
 * interfaces in the weapons class. I have also used inheritance as well as a very abstract methods to my the code more reusable. 
 *
 */


public class Weapons extends InventoryManager implements Comparable<Weapons>{
	
	private String weaponType;

	/**
	 * @param itemName
	 * @param description
	 * @param d
	 * @param qty
	 * @param weaponType
	 */
	public Weapons(String itemName, String description, double d, int qty, String weaponType) {
		super(itemName, description, d, qty);
		this.weaponType = weaponType;
	}
	
	@Override
	public String toString() {
		return "Item: " + this.getItemName() + "\n" 
				+ "Description: " + this.getDescription() + "\n" + "Price: " + this.getPrice() + "\n"+ "Qty: "
				+ this.getQty() + "\n" + "Weapon Type: " + this.weaponType + "\n" + "**************************" + "\n";
	}

	/**
	 * This method sorts my weapon class from ascending alphabetical order. 
	 */
	
	@Override
	public int compareTo(Weapons specifiedObject) {
		/**
		 * 
		 */
		if(this.getItemName() == specifiedObject.getItemName()) {
			return 0;
		}else if(this.getItemName() != specifiedObject.getItemName()) {
			return -1;
		}else {
		return 1;
		}

	
	}

}
