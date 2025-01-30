package lab5threfactoring;

public class calculatesalary {
	
	Employee e1=new Employee();

	public static EmployeeType Payamount(e1) {
	     switch (e1.type) {
	         case "0":
	             return new Engineer();
	         case "1":
	             return new salesman();
	         case "2":
	             return new manager();
	         default:
	             return new NullObject();
	     }
	
	

}
