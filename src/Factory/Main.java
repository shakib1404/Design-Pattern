package Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory f1= new pizzafactory();
		Factory f2=new Burgerfactory();
	    Product f3=f1.create();
	    Product f4=f2.create();
	    
	    f3.deliver();
	    f4.deliver();
	     

	}

}
