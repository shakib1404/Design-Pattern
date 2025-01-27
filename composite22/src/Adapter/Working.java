package Adapter;

public class Working implements Adapter{
	
	Service s1=new Service();

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		s1.service();
		
	}

}
