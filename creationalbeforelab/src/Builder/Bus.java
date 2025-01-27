package Builder;

public class Bus {

	private String color;
	private String type;
	
	
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Bus [color=" + color + ", type=" + type + "]";
	}
  
	
}
