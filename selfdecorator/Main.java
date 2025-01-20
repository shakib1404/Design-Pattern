package selfdecorator;

public class Main {
	
	public static void main(String [] args)
	{
		Coffee c1=new BasicCoffee();
		MilkDecorator m1=new MilkDecorator(c1);
		SugarDecorator s1=new SugarDecorator(m1);
		Wrappedcream w1=new Wrappedcream(s1);
		
		w1.getDescription();
		
		
	}

}
