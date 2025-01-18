package abstractf;

public class Main {
	public static void main()
	{
		Factory f1= new ModernFactory();
		Factory f2=new VictorianFactory();
		chair c1=f1.createchair();
		table t1=f1.createtable();
		c1.sitOn();
		t1.putOn();
	}

}
