package Protoytpe;

public class electronic extends Product{
	
	double batterylife;

	public electronic(String name, String price,double batterylife) {
		super(name, price);
		this.batterylife=batterylife;
		// TODO Auto-generated constructor stub
	}

	public double getBatterylife() {
		return batterylife;
	}

	public void setBatterylife(double batterylife) {
		this.batterylife = batterylife;
	}

	@Override
	public Product clone() {
		// TODO Auto-generated method stub
		return new electronic(getName(),getPrice(),batterylife);
	}

	@Override
	public String toString() {
		return "electronic [batterylife=" + batterylife + ", name=" + name + ", price=" + price + "]";
	}
	
	
	

	
	

}
