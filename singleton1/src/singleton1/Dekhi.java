package singleton1;

 class Dekhi {
	
	public static  Dekhi obj;
	private Dekhi()
	{
		System.out.println("hello dekhi");
	}
	
	public static Dekhi getInstance()
	{
		
		if(obj==null)
		{
			synchronized(Dekhi.class)
			{

				if(obj==null)
				{
					obj=new Dekhi();
				}
				
			}
			//obj=new Dekhi();
		}
		return obj;
	}
	
	

}
