package selfdecorator;

public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Coffee wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	public void getDescription()
	{
		super.getDescription();
		System.out.println("added some milk..");
	}

}
