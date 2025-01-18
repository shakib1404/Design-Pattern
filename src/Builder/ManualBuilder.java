package Builder;

public class ManualBuilder implements Builder {
	
	Manual c1;
	
	public ManualBuilder()
	{
	     reset();
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		c1= new Manual();
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
	
	public Manual getProduct() {
		// TODO Auto-generated method stub
		return  c1;
	}
	

}
