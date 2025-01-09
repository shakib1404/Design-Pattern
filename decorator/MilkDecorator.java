package decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5;  // Adding cost of milk
    }

    @Override
    public String ingredients() {
        return coffee.ingredients() + ", Milk";
    }
}
