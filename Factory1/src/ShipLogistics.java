
public class ShipLogistics extends Logistics{
	
	public  Transport createTransport() {
		
		return new Ship();
	}

}
