package Decoratorbeforelab;

public class FacebookDecorator extends BaseDecorator{

	public FacebookDecorator(Decorator wrappee) {
		super(wrappee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sendMessage(String message)
	{
		super.sendMessage(message);
		System.out.println("hello i am fb "+message);
	}

}
