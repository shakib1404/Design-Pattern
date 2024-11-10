package Customer;

public class Customer {
	
	  private  String firstName;
	    private  String middleName;
	    private  String lastName;
	    private  String primaryEmail;
	    private  String secondaryEmail;
	    private  String primaryMobileNumber;
	    private  String secondaryMobileNumber;
	    private int age;
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void setPrimaryEmail(String primaryEmail) {
			this.primaryEmail = primaryEmail;
		}
		public void setSecondaryEmail(String secondaryEmail) {
			this.secondaryEmail = secondaryEmail;
		}
		public void setPrimaryMobileNumber(String primaryMobileNumber) {
			this.primaryMobileNumber = primaryMobileNumber;
		}
		public void setSecondaryMobileNumber(String secondaryMobileNumber) {
			this.secondaryMobileNumber = secondaryMobileNumber;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
					+ ", primaryEmail=" + primaryEmail + ", secondaryEmail=" + secondaryEmail + ", primaryMobileNumber="
					+ primaryMobileNumber + ", secondaryMobileNumber=" + secondaryMobileNumber + ", age=" + age + "]";
		}
	    
		
	    
	    

}
