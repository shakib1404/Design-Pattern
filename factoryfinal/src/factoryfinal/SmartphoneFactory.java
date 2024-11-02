package factoryfinal;

 class SmartphoneFactory implements DeviceFactory {
	 
	 
	    
	 public Device createDevice() {
	        return new Smartphone();
	    }

}
