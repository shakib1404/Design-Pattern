package Customer;

public class DirectorCustomer {
	
	public void getCustomer(CustomerBuilder builder)
	{
		builder.setfirstName("shakibul ");
		builder.middleName("islam");
		builder.lastName("Shakib");
		builder.primaryEmail("shakib@gmail.com");
		builder.secondaryEmail("bsse@gmaili");
		builder.primaryMobileNumber("012334");
		builder.secondaryMobileNumber("987676");
		builder.age(23);
	}

}
