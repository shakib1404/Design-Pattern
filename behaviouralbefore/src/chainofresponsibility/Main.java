package chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		leader l1=new leader();
		manager m1=new manager();
		
		l1.setNextApprover(m1);
		
		l1.approval(new purchasreq(500));
		l1.approval(new purchasreq(6000));
		l1.approval(new purchasreq(11000));
	
		

	}

}
