package lab5threfactoring;

public class Manager implements EmployeeType{

	@Override
	public double payAmount(double salary,double commission,double bonus) {
		// TODO Auto-generated method stub
		return salary+bonus;
	}

}
