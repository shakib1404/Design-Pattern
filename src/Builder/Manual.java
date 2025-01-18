package Builder;

public class Manual {
	
	private int numofseats;
	private String Enginename;
	private boolean hascompus;
	private double milage;
	
	
	public int getNumofseats() {
		return numofseats;
	}
	public String getEnginename() {
		return Enginename;
	}
	public boolean isHascompus() {
		return hascompus;
	}
	public double getMilage() {
		return milage;
	}
	public void setNumofseats(int numofseats) {
		this.numofseats = numofseats;
	}
	public void setEnginename(String enginename) {
		Enginename = enginename;
	}
	public void setHascompus(boolean hascompus) {
		this.hascompus = hascompus;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "car [numofseats=" + numofseats + ", Enginename=" + Enginename + ", hascompus=" + hascompus + ", milage="
				+ milage + "]";
	}
	

}
