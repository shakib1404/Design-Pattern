package decoratorNotifier;

public class ConcreteClass implements Notifier {

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("concrete message is"+message);
		
	}

}
