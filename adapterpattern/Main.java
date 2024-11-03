package adapterpattern;

public class Main {

	public static void main(String[] args) {
        
        Service service = new Service();

       
        ClientInterface adapter = new Adapter(service);

      
        Client client = new Client(adapter);
        client.doSomething("TestData");
    }
}
