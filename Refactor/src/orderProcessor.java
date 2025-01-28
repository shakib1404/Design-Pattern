
public class orderProcessor {

    public double calculateOrderAmount(int quantity, double itemPrice, String customerType) {
        double basePrice = quantity * itemPrice;

        // Apply discounts
        double discount;
        if (quantity > 100) {
            discount = basePrice * 0.1;  // 10% discount
        } else if (basePrice > 1000) {
            discount = basePrice * 0.05; // 5% discount
        } else {
            discount = 0;
        }

        // Calculate tax
        double tax;
        if (customerType.equals("VIP")) {
            tax = basePrice * 0.02;  // 2% tax for VIP
        } else {
            tax = basePrice * 0.05;  // 5% tax for regular customers
        }

        return basePrice - discount + tax;
    }

    public static void main(String[] args) {
        orderProcessor processor = new orderProcessor();
        double amount = processor.calculateOrderAmount(120, 15.50, "VIP");
        System.out.println("Total Order Amount: " + amount);
    }
}


class orderdetails{
	
	int quantity;
	double itemPrice;
	String customerType;
	
	orderdetails(int quantity, double itemPrice, String customerType){
		this.quantity=quantity;
		this.itemPrice=itemPrice;
		this.customerType=customerType;
	}
	
	double getbestPrice()
	{
		return quantity * itemPrice;
	}
	
}


public class orderProcessor {
	
	
	public double calculateOrderAmount(orderdetails order) {
        double basePrice = order.getbestPrice();

        // Apply discounts
        double discount=calculatediscount(order.quantity,basePrice);
        double tax=taxcalculator(basePrice,order.customerType);
        return basePrice - discount + tax;
    }
        
        
        
        int calculatediscount(int quan,double base)
        {
        	if (quantity > 100) {
              return base * 0.1;  
            } 
        	if (base > 1000) {
                return  base* 0.05; 
            }
        	return 0;
        }
        // Calculate tax
        double taxcalculator(double base,String customer) {
        	
        	 
           return customer.equals("VIP")?base*0.02 :base*0.05;
                
        	
        	
        }
        
       

        

    public static void main(String[] args) {
        orderProcessor processor = new orderProcessor();
        double amount = processor.calculateOrderAmount(120, 15.50, "VIP");
        System.out.println("Total Order Amount: " + amount);
    }
	
	
}