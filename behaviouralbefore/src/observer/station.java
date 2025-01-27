package observer;
import java.util.ArrayList;
public class station {
 float temp;
 float hum;
 
 ArrayList<Subscriber> observers;
 
 station()
 {
	 this.observers=new  ArrayList<Subscriber>();
 }
 
  
 public void adding(Subscriber s)
 {
	 observers.add(s);
 }
 
 public void removing(Subscriber s)
 {
	 observers.remove(s);
 }
 
 public void notified() {
	 for(Subscriber ob:observers)
	 {
		 ob.update(temp, hum);
	 }
	 
 }





public void setnece(float temp,float hum) {
	this.temp = temp;
	this.hum = hum;
	notified();
}



 
 
 
  }
