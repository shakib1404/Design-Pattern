
public class FactoryMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logistics B1=new TruckLogistics();
		Transport c1=B1.createTransport();
		c1.Deliver();
		
		
		Logistics B2=new ShipLogistics();
		Transport c2=B2.createTransport();
		c2.Deliver();
		

	}
	
	

}
