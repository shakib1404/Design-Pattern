package chainofresponsibilityrg;

//Main class for testing
public class Main {
 public static void main(String[] args) {
     Dialog dialog = new Dialog(null, "https://example.com/help");
     Panel panel = new Panel(dialog, "This is a panel help text.");
     Button button = new Button(panel, "Click this button to submit.");

     panel.add(button);

     System.out.println("Button help:");
     button.showHelp();

     System.out.println("\nPanel help:");
     panel.showHelp();

     System.out.println("\nDialog help:");
     dialog.showHelp();
 }
}