package Prototype;

public class clothing extends Product{
	
	String type;

	public clothing(String name,String type) {
		super(name);
		this.type=type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product clone() {
		// TODO Auto-generated method stub
		return new clothing(getName(),type);
	}

	@Override
	public String toString() {
		return "clothing [type=" + type + ", name=" + name + "]";
	}

	

}
