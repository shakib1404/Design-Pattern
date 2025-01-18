package Factory;

public class pizzafactory implements Factory{

	@Override
	public Product create() {
		// TODO Auto-generated method stub
		return new pizza();
	}

}
