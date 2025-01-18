package abstractf;

public class VictorianFactory implements Factory{

	@Override
	public chair createchair() {
		// TODO Auto-generated method stub
		return new Victorianchair();
	}

	@Override
	public table createtable() {
		// TODO Auto-generated method stub
		return new VictorianTable();
	}

}
