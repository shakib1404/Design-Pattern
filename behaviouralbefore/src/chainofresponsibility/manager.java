package chainofresponsibility;

public class manager extends approver{

	@Override
	public boolean canapprove(double amount) {
		// TODO Auto-generated method stub
		return amount<10000;
	}

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		System.out.println("approved by manager");
		
	}

}
