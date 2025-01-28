
public class OrderProcessor {

    public double processOrder(String customerName, String customerAddress, int quantity, double itemPrice, String deliveryMethod) {
        double basePrice = quantity * itemPrice;

        double shippingCost = calculateShippingCost(deliveryMethod, basePrice);

        System.out.println("Order for " + customerName + " at " + customerAddress);
        return basePrice + shippingCost;
    }

    private double calculateShippingCost(String deliveryMethod, double basePrice) {
        if (deliveryMethod.equals("Express")) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        double totalCost = processor.processOrder("Alice", "123 Main St", 5, 20.0, "Express");
        System.out.println("Total Cost: " + totalCost);
    }
}

class customer{
	String name;
	String address;
	
	customer(String name,String address)
	{
		this.name=name;
		this.address=address;
		
		
	}
}

class Order {
    private final int quantity;
    private final double itemPrice;
    private final String deliveryMethod;

    public Order(int quantity, double itemPrice, String deliveryMethod) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.deliveryMethod = deliveryMethod;
    }

    public double getBasePrice() {
        return quantity * itemPrice;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }
}

public class OrderProcessor {

    public double processOrder(Customer customer, Order order) {
        double basePrice = order.getBasePrice();
        double shippingCost = calculateShippingCost(order);
        printOrderSummary(customer, basePrice, shippingCost);
        return basePrice + shippingCost;
    }

    private double calculateShippingCost(Order order) {
        return order.getDeliveryMethod().equals("Express") ? order.getBasePrice() * 0.1 : order.getBasePrice() * 0.05;
    }

    private void printOrderSummary(Customer customer, double basePrice, double shippingCost) {
        System.out.println("Order for " + customer.getName() + " at " + customer.getAddress());
        System.out.println("Base Price: " + basePrice);
        System.out.println("Shipping Cost: " + shippingCost);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "123 Main St");
        Order order = new Order(5, 20.0, "Express");
        OrderProcessor processor = new OrderProcessor();
        double totalCost = processor.processOrder(customer, order);
        System.out.println("Total Cost: " + totalCost);
    }
}

