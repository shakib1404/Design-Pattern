
public class mordernfactory implements furniturefactory{
	
	public chair createchair() {
		return new MordernChair();
	}
	public table createtable()
	{
		return new morderntable();
		
	}
	public sofa createsofa()
	{
		return new mordernsofa();
	}

}
