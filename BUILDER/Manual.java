package BUILDER;

public class Manual {
private int seats;
private String engine;
private boolean hasTripComputer;
private boolean hasGPS;
public int getSeats() {
	return seats;
}

public void setSeats(int seats) {
	this.seats = seats;
}
public void setEngine(String engine) {
	this.engine = engine;
}
public void setHasTripComputer(boolean hasTripComputer) {
	this.hasTripComputer = hasTripComputer;
}
public void setHasGPS(boolean hasGPS) {
	this.hasGPS = hasGPS;
}

@Override
public String toString() {
	return "Manual [seats=" + seats + ", engine=" + engine + ", hasTripComputer=" + hasTripComputer + ", hasGPS="
			+ hasGPS + "]";
}




}
