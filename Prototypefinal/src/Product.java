

public abstract class Product {
    private String name;
    private String category;
    private double price;

   
  
   


	public Product(String name, String category,double price) {
		super();
		this.name = name;
		this.category = category;
		this.price=price;
	}

	 public abstract Product cloneProduct();

	public String getName() {
		return name;
	}

	

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

    
}
