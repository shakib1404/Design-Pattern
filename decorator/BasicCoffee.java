package decorator;

public class BasicCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0;  // Base cost of basic coffee
    }

    @Override
    public String ingredients() {
        return "Coffee";
    }
}
