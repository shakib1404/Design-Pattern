package decoratorNotifier;

public class BaseDecorator implements Notifier {
	
	protected Notifier wrapee;
	
	

	public BaseDecorator(Notifier wrapee) {
		
		this.wrapee = wrapee;
	}



	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
	       wrapee.sendMessage(message);
		
	}



	


	






	

}
