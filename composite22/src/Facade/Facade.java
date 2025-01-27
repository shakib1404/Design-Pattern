package Facade;

public class Facade {
	audio a1=new audio();
	video v1=new video();
	
	
	public void on()
	{
		a1.on();
		v1.on();
	}
	
	public void off()
	{
		a1.off();
		v1.off();
	}

}
