package Builder;

public class Director {
	
	public void carbuild(builder bill)
	{
		bill.reset();
		bill.milage();
		bill.color("green");
		bill.engine("nice");
	}
	
	public void busbuild(builder bill)
	{
		bill.reset();
		bill.milage();
		bill.color("yellow");
		bill.engine("awesome");
	}

}
