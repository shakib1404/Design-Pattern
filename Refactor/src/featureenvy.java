
class Customer {
    private String name;
    private String address;
    private Order order;

    public Customer(String name, String address, Order order) {
        this.name = name;
        this.address = address;
        this.order = order;
    }

    public double calculateTotalCost() {
        // Feature envy: accessing fields of Order
        double basePrice = order.getQuantity() * order.getItemPrice();
        double tax = basePrice * 0.05;
        return basePrice + tax;
    }
}

class Order {
    private int quantity;
    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}


class Customer {
    private String name;
    private String address;
    private Order order;

    public Customer(String name, String address, Order order) {
        this.name = name;
        this.address = address;
        this.order = order;
    }

    public double getTotalCost() {
        return order.calculateTotalCost();
    }
}

class Order {
    private int quantity;
    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    // Moved method from Customer to Order
    public double calculateTotalCost() {
        double basePrice = quantity * itemPrice;
        double tax = basePrice * 0.05;
        return basePrice + tax;
    }
}

