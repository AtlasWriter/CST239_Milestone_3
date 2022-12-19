/**
 * 
 */
package rumfelt;

/**
 * @author User
 *
 */
public class InventoryManager  {
	
	private String itemName;
	protected String description;
	private double price;
	private int qty;
	/**
	 * @param itemName
	 * @param description
	 * @param price
	 * @param qty
	 */
	public InventoryManager(String itemName, String description, double price, int qty) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.qty = qty;
	}
	
	public InventoryManager(InventoryManager source) {
		super();
		this.itemName = source.itemName;
		this.description = source.description;
		this.price = source.price;
		this.qty = source.qty;
	}
	
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return this.itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return this.qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item Name: " + this.itemName + " Description: " + this.description + " Price: "
				+ this.price + " Qty: " + this.qty;
	}


	
	
	
	
	
	
	

}



