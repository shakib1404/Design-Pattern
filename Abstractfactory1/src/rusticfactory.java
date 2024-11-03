
public class rusticfactory implements furniturefactory{
	
	public chair createchair() {
		return new rusticchair();
	}
	public rustictable createtable()
	{

		return new rustictable();
		
	}
	public sofa createsofa()
	{
		return new rusticsofa();
	}

}
