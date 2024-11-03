
public class Application {
	private chair Chair;
	private table Table;
	private sofa Sofa;
	
	
	Application(furniturefactory furniture)
	{
		Chair=furniture.createchair();
		Table=furniture.createtable();
		Sofa=furniture.createsofa();
	}
	
	public void createfurniture()
	{
		Chair.create();
		Table.create();
		Sofa.create();
	}

}
