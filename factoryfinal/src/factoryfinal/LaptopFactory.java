package factoryfinal;

class LaptopFactory implements DeviceFactory {

    public Device createDevice() {
        return new Laptop();
    }
}