package selfdecorator;

public class Wrappedcream extends CoffeeDecorator{

	public Wrappedcream(Coffee wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	public void getDescription()
	{
		super.getDescription();
		System.out.println("added some cream");
	}

}
