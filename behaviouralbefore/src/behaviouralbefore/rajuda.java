package behaviouralbefore;

public class rajuda {
	String name;
	behaviour b1;
	public rajuda(String name, behaviour b1) {
		super();
		this.name = name;
		this.b1 = b1;
	}

	public void setB1(behaviour b1) {
		this.b1 = b1;
		System.out.println("changed");
	}
	
	public void perform()
	{
		System.out.println("performing" +name);
		 b1.execute();
	}

	
}
