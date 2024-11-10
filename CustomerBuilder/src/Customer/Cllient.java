package Customer;

public class Cllient {
    public static void main(String[] args) {
        DirectorCustomer director = new DirectorCustomer();
        
        CustomerBuilder customerBuilder = new RegularCustomer();
        director.getCustomer(customerBuilder);
        
        Customer customer = customerBuilder.Build();
        
        System.out.println(customer);
    }
}
