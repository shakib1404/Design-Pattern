package Decoratorbeforelab;

public class WhatsappDecorator extends BaseDecorator{

	public WhatsappDecorator(Decorator wrappee) {
		super(wrappee);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sendMessage(String message)
	{
		super.sendMessage(message);
		System.out.println("hello i am WA "+message);
	}

}
