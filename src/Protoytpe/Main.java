package Protoytpe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1=new clothing("name","50","12.4","green");
		Product p2=new electronic("name2","100",23.00);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Registry r1=new Registry();
		r1.add("shirt", p1);
		r1.add("battery", p2);
		
		
		System.out.println(r1.get("shirt"));
		System.out.println(r1.get("battery"));

	}

}
