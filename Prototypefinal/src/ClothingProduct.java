


public class ClothingProduct extends Product {
    private String size;
    private String color;

    public ClothingProduct(String name, String category, double price, String size, String color) {
        super(name, category, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public Product cloneProduct() {
        return new ClothingProduct(getName(), getCategory(), getPrice(), size, color);
    }

   

    public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
    public String toString() {
        return "ClothingProduct{" +
               "name='" + getName() + '\'' +
               ", category='" + getCategory() + '\'' +
               ", price=" + getPrice() +
               ", size='" + size + '\'' +
               ", color='" + color + '\'' +
               '}';
    }
}
