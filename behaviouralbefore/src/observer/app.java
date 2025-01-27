package observer;

public class app implements Subscriber{
	
	public void update(float temp, float hum) {
		// TODO Auto-generated method stub
		System.out.println("app "+temp +" " +hum);
		
	}

}
