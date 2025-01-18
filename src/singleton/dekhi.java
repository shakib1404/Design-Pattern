package singleton;

public class dekhi {
	private static dekhi obj;
	 public dekhi()
	 {
		System.out.println("dekhte valo");
	 }
	 
	 public static dekhi getInstance()
	 {
		 
		 if(obj==null)
		 {
			 synchronized(dekhi.class)
			 {
				 if(obj==null)
				 {
					 obj=new dekhi();
				 }
			 }
		 }
		 return obj;
	 }

}
