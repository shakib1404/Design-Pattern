package lab5threfactoring;

public class Employee {
	private int type;
	private calculatesalary s1;
	private static final int engineer=0;
	private static final int salesman=1;
	private static final int manager=2;
	
	public Employee(int type,calculatesalary s1)
	{
		this.type=type;
		this.s1=s1;
	}
	
	double payment()
	{
		return 0;
	}

}
