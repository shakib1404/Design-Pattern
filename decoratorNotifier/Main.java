package decoratorNotifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConcreteClass a1=new ConcreteClass();
		FacebookNotifier f1=new FacebookNotifier(a1);
		SmsNotifier s1=new SmsNotifier(f1);
		SlackNotifier sl1=new SlackNotifier(s1);
		
		sl1.sendMessage("hello world");
		
		
	}

}
