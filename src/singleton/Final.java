package singleton;

public class Final {
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Runnable()
				{
			public void run() {
				dekhi obj=dekhi.getInstance();
			}
				});
		
		
		Thread t2=new Thread(new Runnable()
		{
	public void run() {
		dekhi obj=dekhi.getInstance();
	}
		});
		
		t1.start();
		t2.start();

	}
	
}
