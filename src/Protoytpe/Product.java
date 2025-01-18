package Protoytpe;

public abstract class Product {
	
	String name;
	String price;
	
	public Product(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public abstract Product clone();

}
