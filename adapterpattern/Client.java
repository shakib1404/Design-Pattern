package adapterpattern;

public class Client {
	private ClientInterface clientInterface;

    // Client takes a ClientInterface object
    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    // Client's method to perform an operation
    public void doSomething(String data) {
        clientInterface.method(data);
    }
}
