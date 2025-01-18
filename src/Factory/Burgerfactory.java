package Factory;

public class Burgerfactory implements Factory{

	@Override
	public Product create() {
		// TODO Auto-generated method stub
		return new Burger();
	}

}
