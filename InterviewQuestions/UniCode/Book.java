package UniCode;

public class Book {
	private String name;
	private int quantity;
	private double unit_price;

	public Book (String name, double price, int quantity) {
	  this.name=name;
	  this.unit_price=price;
	  this.quantity=quantity;
	}

	public String getName() {
			return name;
	  
		}

	public double getPrice() {
			return unit_price;
		}

	public int getInt() {
			return quantity;
		}

}
