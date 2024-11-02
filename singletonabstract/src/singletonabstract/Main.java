package singletonabstract;
import java.util.*;



public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Choose a furniture style:");
	    System.out.println("1. Modern");
	    System.out.println("2. Victorian");
	    System.out.println("3. Rustic");
	    System.out.print("Enter your choice (1-3): ");

	    int choice = scanner.nextInt();
	    FurnatureFactory factory = null; 

	    switch (choice) {
	        case 1:
	            factory = ModernFactory.getInstance(); 
	            break;
	        case 2:
	            factory = VictorianFactory.getInstance(); 
	            break;
	        case 3:
	            factory = RusticFactory.getInstance(); 
	            break;
	        default:
	            System.out.println("Invalid choice. Please select a number between 1 and 3.");
	            scanner.close();
	            return;
	    }

	    // Check if factory was successfully initialized
	    if (factory == null) {
	        System.out.println("Factory could not be initialized. Exiting.");
	        scanner.close();
	        return;
	    }

	    // Create furniture set
	    Chair chair = factory.createChair();
	    Table table = factory.createTable();
	    Sofa sofa = factory.createSofa();

	    // Display the selected furniture set
	    System.out.println("\nHere is your selected furniture set:");
	    chair.sitOn();
	    table.use();
	    sofa.lieDown();

	    // Close the scanner
	    scanner.close();
	}

}