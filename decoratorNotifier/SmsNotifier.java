package decoratorNotifier;

public class SmsNotifier extends BaseDecorator{

	public SmsNotifier(Notifier wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	
	public void sendMessage(String message)
	{
		super.sendMessage(message);
	System.out.println("sms message"+message);
	}
	
	
	
	
}
