package Proxy;

public class Working implements Proxy{
	
	Service s1=new Service();

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		s1.operation();
		
	}

}
