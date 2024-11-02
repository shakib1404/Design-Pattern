

public class ElectronicProduct extends Product {
    private int storage;
    private int batteryLife;

    public ElectronicProduct(String name, String category, double price, int storage, int batteryLife) {
        super(name, category, price);
        this.storage = storage;
        this.batteryLife = batteryLife;
    }

   
    public Product cloneProduct() {
        return new ElectronicProduct(getName(), getCategory(), getPrice(), storage, batteryLife);
    }

    
    public int getStorage() {
		return storage;
	}


	public void setStorage(int storage) {
		this.storage = storage;
	}


	public int getBatteryLife() {
		return batteryLife;
	}


	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}


	public String toString() {
        return "ElectronicProduct{" +
               "name='" + getName() + '\'' +
               ", category='" + getCategory() + '\'' +
               ", price=" + getPrice() +
               ", storage=" + storage +
               "GB, batteryLife=" + batteryLife +
               " hours}";
    }
}
