package Builder;

public class carBuilder implements Builder{
	
	car c1;
	public carBuilder()
	{
	     reset();
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		c1= new car();
	}
	@Override
	public void setnumofseats(int seats) {
		// TODO Auto-generated method stub
		c1.setNumofseats(seats);
	}
	@Override
	public void setEnginename(String name) {
		// TODO Auto-generated method stub
		c1.setEnginename(name);
	}
	@Override
	public void sethascompus() {
		// TODO Auto-generated method stub
		c1.setHascompus(true);
	}
	@Override
	public void setmilage() {
		// TODO Auto-generated method stub
		c1.setMilage(34.00);;
	}
	
	public car getProduct() {
		// TODO Auto-generated method stub
		return  c1;
	}
	

}
