class ConcreteStrategyC implements Strategy {
    @Override
    public String execute(String data) {
        return "Processing data using strategy C: " + data;
    }
}
