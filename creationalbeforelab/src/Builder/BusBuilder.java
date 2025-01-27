package Builder;

public class BusBuilder implements builder{
	
	Bus c1;
    public BusBuilder() {
		
		this.reset();
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.c1=new Bus();
		
	}

	@Override
	public void milage() {
		// TODO Auto-generated method stub
		System.out.println("100");
		
	}

	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		c1.setColor(color);
		
	}

	@Override
	public void engine(String type) {
		// TODO Auto-generated method stub
		c1.setType(type);
		
	}

	
	public Bus getProduct() {
		// TODO Auto-generated method stub
		return this.c1;
	}

}
