package behaviouralbefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aggresive a1=new aggresive();
		defensive d1=new defensive();
		
		rajuda r1=new rajuda("r1",a1);
		r1.perform();
		r1.setB1(d1);
		r1.perform();

	}

}
