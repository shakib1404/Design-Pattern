package observer;

public class tv implements Subscriber{

	@Override
	public void update(float temp, float hum) {
		// TODO Auto-generated method stub
		System.out.println("tv "+temp +" " +hum);
		
	}

}
