package composite22;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Component f1=new leaf();
		Component f2=new leaf();
		Component f3=new Guccho();
		Component f4=new Guccho();
		Component f5=new leaf();
		((Guccho) f4).add(f5);
		
		((Guccho) f3).add(f1);
		((Guccho) f3).add(f2);
		((Guccho) f3).add(f4);
		f3.execute();

	}

}
