package adapterpattern;

public class Adapter implements ClientInterface{
	
	private Service adaptee;

    
    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    
    @Override
    public void method(String data) {
      
        String specialData = convertToServiceFormat(data);
        adaptee.serviceMethod(specialData);
    }

    
    private String convertToServiceFormat(String data) {
        
        return "SpecialFormat-" + data;
    }

}
