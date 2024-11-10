package securityproxy;

public class ProxyPatternClass {
	  public static void main(String[] args)   
	    {  
	        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");  
	        access.grantInternetAccess();  
	    }  
}
