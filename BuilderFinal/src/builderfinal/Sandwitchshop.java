package builderfinal;

import java.util.Scanner;

public class Sandwitchshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Director director = new Director();
    SandwitchBuilder     builder=new builder();
        Sandwitch sandwich;

       /* System.out.println("Welcome to the Sandwich Shop! Choose a sandwich to order:");
        System.out.println("1. Chicken Sandwich");
        System.out.println("2. Egg Sandwich");
        System.out.println("3. Veggie Sandwich");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Sandwitch sandwich;
        switch (choice) {
            case 1:*/
                director.makeChickenSandwich(builder);
                sandwich = builder.build();
                System.out.println("You ordered: " + sandwich);
                //break;
            //case 2:
                director.makeEggSandwich(builder);
                sandwich = builder.build();
                System.out.println("You ordered: " + sandwich);
               // break;
           // case 3:
                director.makeVeggieSandwich(builder);
                sandwich = builder.build();
                System.out.println("You ordered: " + sandwich);
              //  break;
           //default:
               // System.out.println("Invalid choice. Please choose a valid option.");
               // return;
      //  }

      // scanner.close();
                
                
                SandwitchBuilder builder2=new builderManual();
                director.builderManual(builder2);
                sandwich =builder2.build();
                
                System.out.println(sandwich);
                
                
    }
}
