package selfdecorator;

public class CoffeeDecorator implements Coffee{
	
	Coffee wrapee;

	public CoffeeDecorator(Coffee wrapee) {
		super();
		this.wrapee = wrapee;
	}

	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		wrapee.getDescription();
		
	}
	
	

}
