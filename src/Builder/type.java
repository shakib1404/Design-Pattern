package Builder;

public class type {

	public car sub(carBuilder b1)
	{
		b1.reset();
		b1.setnumofseats(4);
		b1.setEnginename("kalu");
		b1.sethascompus();
		b1.setmilage();
		
		return b1.getProduct();
		
	}
	
	public Manual tub(ManualBuilder b1)
	{
		b1.reset();
		b1.setnumofseats(5);
		b1.setEnginename("kaluda");
		b1.sethascompus();
		b1.setmilage();
		
		return b1.getProduct();
		
	}
}
