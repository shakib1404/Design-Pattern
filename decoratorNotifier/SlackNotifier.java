package decoratorNotifier;

public class SlackNotifier extends BaseDecorator{

	public SlackNotifier(Notifier wrapee) {
		super(wrapee);
		// TODO Auto-generated constructor stub
	}
	
	public void sendMessage(String message)
	{
		super.sendMessage(message);
		System.out.println("slack message: "+message);
	}

}
