package Decoratorbeforelab;

public class BaseDecorator implements Decorator{
	
	Decorator wrappee;
	
	

	public BaseDecorator(Decorator wrappee) {
		super();
		this.wrappee = wrappee;
	}



	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		wrappee.sendMessage(message);
		
	}

}
