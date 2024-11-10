package Customer;

public interface CustomerBuilder {

	  CustomerBuilder setfirstName(String firstName);
	  CustomerBuilder  middleName(String middleName);
	  CustomerBuilder  lastName(String lastName);
	  CustomerBuilder  primaryEmail(String primaryEmail);
	  CustomerBuilder  secondaryEmail(String secondaryEmail);
	  CustomerBuilder  primaryMobileNumber(String primaryMobileNumber);
	  CustomerBuilder  secondaryMobileNumber(String seconfaryMobileNumber);
	  CustomerBuilder  age(int age);
	  Customer Build();

}
