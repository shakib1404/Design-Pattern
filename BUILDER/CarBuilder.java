package BUILDER;

public class CarBuilder implements Builder {
	
	private Car car;
	public CarBuilder() {
		
		this.reset();
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.car=new Car();
		
		
	}



	@Override
	public void setSeats(int number) {
		// TODO Auto-generated method stub
		car.setSeats(number);
		
		
	}

	@Override
	public void setEngine(String engine) {
		// TODO Auto-generated method stub
		car.setEngine(engine);
		
	}

	@Override
	public void setTripComputer() {
		// TODO Auto-generated method stub
		car.setHasTripComputer(true);
		
	}

	@Override
	public void setGPS() {
		// TODO Auto-generated method stub
		car.setHasGPS(true);
		
	}
	
	 public Car getResult() {
	        return this.car;
	    }
	
	

}
