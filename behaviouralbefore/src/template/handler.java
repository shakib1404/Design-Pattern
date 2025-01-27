package template;

public abstract class handler {
	
	void prepare()
	{
		read();
		doin();
		write();
	}
	
	void read() {
		System.out.println("reading");
	}

	void doin() {
		System.out.println("writng");
	}
	
	public abstract void write();
}
