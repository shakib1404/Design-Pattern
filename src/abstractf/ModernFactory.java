package abstractf;

public class ModernFactory implements Factory{

	@Override
	public chair createchair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public table createtable() {
		// TODO Auto-generated method stub
		return new ModernTable();
	}

	

}
