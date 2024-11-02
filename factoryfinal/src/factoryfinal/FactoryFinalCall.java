package factoryfinal;

public class FactoryFinalCall {

	public static void main(String[] args) {
		
	
        DeviceFactory smartphoneFactory = new SmartphoneFactory();
        DeviceFactory tabletFactory = new TabletFactory();
        DeviceFactory laptopFactory = new LaptopFactory();
        
       
        System.out.println("Using Smartphone:");
        Device smartphone = smartphoneFactory.createDevice();
        smartphone.powerOn();
        smartphone.powerOff();
        
        
        System.out.println("\nUsing Tablet:");
        Device tablet = tabletFactory.createDevice();
        tablet.powerOn();
        tablet.powerOff();
        
       
        System.out.println("\nUsing Laptop:");
        Device laptop = laptopFactory.createDevice();
        laptop.powerOn();
        laptop.powerOff();
		

	}

}
