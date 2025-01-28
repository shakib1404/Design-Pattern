package chainofresponsibilityrg;

//Abstract Component class
abstract class Component implements ComponentWithContextualHelp {
 protected Container container;
 protected String tooltipText;

 public Component(Container container, String tooltipText) {
     this.container = container;
     this.tooltipText = tooltipText;
 }

 @Override
 public void showHelp() {
     if (tooltipText != null) {
         System.out.println("Tooltip: " + tooltipText);
     } else if (container != null) {
         container.showHelp();
     }
 }
}

