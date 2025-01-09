package decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;  // Adding cost of sugar
    }

    @Override
    public String ingredients() {
        return coffee.ingredients() + ", Sugar";
    }
}
