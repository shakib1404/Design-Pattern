import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for furniture type
        //System.out.println("Enter furniture type (chair/sofa/table):");
      //  String furnitureType = scanner.nextLine().toLowerCase();

        // Factory selection based on input
        System.out.println("Enter furniture style (modern/victorian):");
        String style = scanner.nextLine().toLowerCase();

        // Create appropriate factory based on style
        furniturefactory factory = null;
        if (style.equals("modern")) {
            factory = new mordernfactory();
        } else if (style.equals("victorian")) {
            factory = new victorianfactory();
        }
        else if(style.equals("rustic"))
        {
        	factory=new rusticfactory();
        }
        else {
            System.out.println("Invalid style selected.");
            return;
        }

        // Application class
        Application client = new Application(factory);
        client.createfurniture();

        scanner.close();
    }

}//
