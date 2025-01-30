package lab5thfinal;

public class bidders2 implements bidders{
	
	String name;
	boolean accept;
	
	

	public bidders2(String name, boolean accept) {
		super();
		this.name = name;
		this.accept = accept;
	}
	@Override
	public void update(float money) {
		// TODO Auto-generated method stub
		System.out.println("bid price changes to "+money);
		
	}
	String show() {
		return "name:"+name +" "+accept;
	}


}
