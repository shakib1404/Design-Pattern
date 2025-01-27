package chainofresponsibility;

public class leader extends approver {

	@Override
	public boolean canapprove(double amount) {
		// TODO Auto-generated method stub
		return amount<5000;
	}

	@Override
	public void approve() {
		// TODO Auto-generated method stub
		System.out.println("approved by team leader");
		
	}

}
