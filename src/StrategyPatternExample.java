
public class StrategyPatternExample {
    public static void main(String[] args) {
        // Using Strategy A
        Context context = new Context(new ConcreteStrategyA());
        System.out.println(context.executeStrategy("data1"));

        // Switching to Strategy B
        context.setStrategy(new ConcreteStrategyB());
        System.out.println(context.executeStrategy("data2"));

        // Switching to Strategy C
        context.setStrategy(new ConcreteStrategyC());
        System.out.println(context.executeStrategy("data3"));
    }
}