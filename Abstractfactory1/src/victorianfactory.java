
public class victorianfactory implements furniturefactory{
	
	
	
	public chair createchair() {
		return new victorianchair();
	}
	public table createtable()
	{
		return new victoriantable();
		
	}
	public sofa createsofa()
	{
		return new victoriansofa();
	}

}
