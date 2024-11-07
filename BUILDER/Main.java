package BUILDER;

public class Main {

	 public static void main(String[] args) {
	        Director director = new Director();

	        // Build a Car
	        CarBuilder carBuilder = new CarBuilder();
	        director.makeSportsCar(carBuilder);
	        Car car = carBuilder.getResult();
	        System.out.println(car);

	        // Build a Manual
	        CarManualBuilder manualBuilder = new CarManualBuilder();
	        director.makeSportsCar(manualBuilder);
	        Manual manual = manualBuilder.getResult();
	        System.out.println(manual);
	    }
}
