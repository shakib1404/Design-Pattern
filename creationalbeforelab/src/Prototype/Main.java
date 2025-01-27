package Prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrototypeRegistry r1=new PrototypeRegistry();
		Product p1=new clothing("jama","kapor");
		r1.add("shirt", p1);
		 Product p2=r1.get("shirt");
		 System.out.println(p2);
		

	}

}
