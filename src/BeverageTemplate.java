
abstract class BeverageTemplate {

    // Template method - defines the steps of the algorithm
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Common step for all beverages
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Common step for all beverages
    private void pourInCup() {
        System.out.println("Pouring beverage into cup...");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();
}
