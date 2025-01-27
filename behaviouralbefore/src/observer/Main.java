package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        station s1=new station();
        tv t1=new tv();
        app a1=new app();
        s1.adding(t1);
        s1.adding(a1);
        
        s1.setnece(23, 070);
        
        s1.removing(a1);
        s1.setnece(23, 070);
	}

}
