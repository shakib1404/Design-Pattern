package factoryfinal;

class TabletFactory implements DeviceFactory {


    
    public Device createDevice() {
        return new Tablet();
    }
}