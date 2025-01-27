package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new Runnable() {
			
			public void run() {
				Dekhi obj1=Dekhi.getInstances();
			}
		});
		
		
   Thread t2=new Thread(new Runnable() {
			
		     public 	void run() {
				Dekhi obj2=Dekhi.getInstances();
			}
		  });
   t1.start();
   t2.start();


	}

}
