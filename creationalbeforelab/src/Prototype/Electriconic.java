package Prototype;

public class Electriconic extends Product{
	
	float hour;

	public Electriconic(String name, float hour) {
		super(name);
		this.hour = hour;
	}

	@Override
	public Product clone() {
		// TODO Auto-generated method stub
		return new Electriconic(getName(),hour);
	}

	@Override
	public String toString() {
		return "Electriconic [hour=" + hour + ", name=" + name + "]";
	}

	
	
	

}
