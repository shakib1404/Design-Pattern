package Decoratorbeforelab;

public class Simplemessage implements Decorator{

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("hello i am "+message);
		
	}

}
