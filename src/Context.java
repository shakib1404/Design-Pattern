
class Context {
    private Strategy strategy;

    // Constructor to set the strategy
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method to change strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Execute the strategy
    public String executeStrategy(String data) {
        return strategy.execute(data);
    }
}