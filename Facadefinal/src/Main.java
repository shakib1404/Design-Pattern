
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the facade
        PizzaOrderFacade pizzaOrderFacade = new PizzaOrderFacade();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter card information: ");
        String cardInfo = scanner.nextLine();

        System.out.print("Enter security PIN: ");
        String securityPIN = scanner.nextLine();

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter payment type (debit/credit): ");
        String paymentType = scanner.nextLine();

        // Order pizza
        pizzaOrderFacade.orderPizza(amount, cardInfo, securityPIN, paymentType);

        // Close the scanner
        scanner.close();
    }
}
