package Customer;

public class RegularCustomer implements CustomerBuilder{
	
	private Customer customer;
	
	public RegularCustomer() {
	
		this.customer =new Customer();
	}

	@Override
	public CustomerBuilder setfirstName(String firstName) {
		// TODO Auto-generated method stub
		customer.setFirstName(firstName);
		return this;
	}

	@Override
	public CustomerBuilder middleName(String middleName) {
		// TODO Auto-generated method stub
		customer.setMiddleName(middleName);
		return this;
	}

	@Override
	public CustomerBuilder lastName(String lastName) {
		// TODO Auto-generated method stub
		customer.setLastName(lastName);
		return this;
	}

	@Override
	public CustomerBuilder primaryEmail(String primaryEmail) {
		// TODO Auto-generated method stub
		customer.setPrimaryEmail(primaryEmail);
		return this;
	}

	@Override
	public CustomerBuilder secondaryEmail(String secondaryEmail) {
		// TODO Auto-generated method stub
		customer.setSecondaryEmail(secondaryEmail);
		return this;
	}

	@Override
	public CustomerBuilder primaryMobileNumber(String primaryMobileNumber) {
		// TODO Auto-generated method stub
		customer.setPrimaryMobileNumber(primaryMobileNumber);
		return this;
	}

	@Override
	public CustomerBuilder secondaryMobileNumber(String seconfaryMobileNumber) {
		// TODO Auto-generated method stub
		customer.setSecondaryMobileNumber(seconfaryMobileNumber);
		return this;
	}

	@Override
	public CustomerBuilder age(int age) {
		// TODO Auto-generated method stub
		customer.setAge(age);
		return this;
	}

	@Override
	public Customer Build() {
		// TODO Auto-generated method stub
		return this.customer;
	}

	
	
	

}
