package selfdecorator;

public class SugarDecorator extends CoffeeDecorator{

	public SugarDecorator(Coffee wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	public void getDescription()
	{
		super.getDescription();
		System.out.println("added some sugar");
	}

}
