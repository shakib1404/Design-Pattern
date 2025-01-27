package Decoratorbeforelab;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decorator d1=new Simplemessage();
		Decorator d2=new FacebookDecorator(d1);
		Decorator d3=new WhatsappDecorator(d2);
		
		d3.sendMessage("hiii guyss");
		

	}

}
