package Builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carBuilder b1=new carBuilder();
		ManualBuilder c1=new ManualBuilder();
		
		type t1=new type();
	    
		car c11=t1.sub(b1);
		Manual c22=t1.tub(c1);
		
		System.out.println(c11);
		System.out.println(c22);
		

	}

}
