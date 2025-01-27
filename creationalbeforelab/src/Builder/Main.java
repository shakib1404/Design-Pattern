package Builder;

public class Main {
	public static void main(String[] args)
	{
		
		CarBuilder b1=new CarBuilder();
		Director d1=new Director();
		d1.carbuild(b1);
		car c1=b1.getProduct();
		System.out.println(c1);
	
			
	}

}
