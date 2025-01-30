package lab5thfinal;

import java.util.ArrayList;
import java.util.List;



public class auctioneer {
	
	 float money;
	    private final List<bidders > observers;

	    public auctioneer() {
	        observers = new ArrayList<>();
	    }

	    
	    public void registerObserver(bidders observer) {
	        observers.add(observer);
	    }

	   
	    public void removeObserver(bidders observer) {
	        observers.remove(observer);
	    }

	    
	    public void notifyObservers() {
	        for (bidders observer : observers) {
	            observer.update( money);
	        }
	    }
	    
	 // Method to update weather data
	    public void setmoney(float money) {
	        this.money = money;
	       
	        notifyObservers(); // Notify observers of the change
	    }

}
