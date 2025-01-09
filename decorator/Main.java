package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new BasicCoffee();
        System.out.println("Ingredients: " + myCoffee.ingredients() + " | Cost: $" + myCoffee.cost());

        // Add Milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("Ingredients: " + myCoffee.ingredients() + " | Cost: $" + myCoffee.cost());

        // Add Sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println("Ingredients: " + myCoffee.ingredients() + " | Cost: $" + myCoffee.cost());
    }
}

