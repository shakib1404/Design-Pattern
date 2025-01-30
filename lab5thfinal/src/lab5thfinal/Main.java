package lab5thfinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		auctioneer a1=new auctioneer();
		 bidders bidder1 = new bidders1("shakib",true);
	        bidders bidder2 = new bidders2("rahim",false);
	        
	        
	        a1.registerObserver(bidder1);
	        a1.registerObserver(bidder2);

	        a1.setmoney(100.0f);
	        System.out.println(((bidders1) bidder1).show());
	        a1.setmoney(150.0f);

	        a1.removeObserver(bidder1);

	        a1.setmoney(200.0f);
	    }
		

	

}




