package singleton;

public class Dekhi {

	private static Dekhi obj;
	
	Dekhi()
	{
		System.out.println("hello i am hello");
	}

	
	public static Dekhi getInstances()
	{
		if(obj==null)
		{
			synchronized(Dekhi.class)
			{
				if(obj==null) {
					obj=new Dekhi();
				}
			}
		}
			
			return obj;
	}
}
