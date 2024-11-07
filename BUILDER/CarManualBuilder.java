package BUILDER;

public class CarManualBuilder implements Builder{
	
	private Manual manual;
	
	public CarManualBuilder()
	{
		this.reset();
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.manual=new Manual();
		
	}

	@Override
	public void setSeats(int number) {
		// TODO Auto-generated method stub
		manual.setSeats(number);
		
	}

	@Override
	public void setEngine(String engine) {
		// TODO Auto-generated method stub
		manual.setEngine(engine);
		
	}

	@Override
	public void setTripComputer() {
		// TODO Auto-generated method stub
		manual.setHasTripComputer(true);
		
	}

	@Override
	public void setGPS() {
		// TODO Auto-generated method stub
		manual.setHasGPS(true);
		
	}
	

    public Manual getResult() {
        return this.manual;
    }
	

}
