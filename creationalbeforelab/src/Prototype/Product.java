package Prototype;

public abstract class Product {
	
	String name;
	
	
	public String getName() {
		return name;
	}




	public Product(String name) {
		super();
		this.name = name;
	}


	public abstract Product clone();

}
