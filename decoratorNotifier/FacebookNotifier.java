package decoratorNotifier;

public class FacebookNotifier extends BaseDecorator {

	
	
	public FacebookNotifier(Notifier wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}

	
	public void sendMessage(String message)
	{
		super.sendMessage(message);
		System.out.println("facebook message: "+message);
	}
}
