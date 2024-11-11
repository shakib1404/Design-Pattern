package builderfinal;

public class Director {
    public void makeChickenSandwich(SandwitchBuilder builder) {
        
        builder.setBread("regular")
               .setFilling("grilled chicken")
               .setAccompaniment("cheese");
    }

    public void makeEggSandwich(SandwitchBuilder builder) {
       
        builder.setBread("toasted")
               .setFilling("fried egg")
               .setAccompaniment("sauce");
    }

    public void makeVeggieSandwich(SandwitchBuilder builder) {
        
        builder.setBread("whole grain")
               .setFilling("grilled veggies")
               .setAccompaniment("hummus");
    }
    
 public void builderManual(SandwitchBuilder builder) {
        
        builder.setBread("regular")
               .setFilling("grilled chicken")
               .setAccompaniment("cheese");
    }
}