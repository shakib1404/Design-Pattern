package Protoytpe;

public class clothing extends Product{
	
	String size;
	String color;
	
	public clothing(String name, String price, String size, String color) {
		super(name, price);
		this.size = size;
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public Product clone() {
		// TODO Auto-generated method stub
		return new clothing(getName(),getPrice(),size,color);
	}

	@Override
	public String toString() {
		return "clothing [size=" + size + ", color=" + color + ", name=" + name + ", price=" + price + "]";
	}

	
	
	

}
