package Builder;

public class car {
	
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
		return "car [color=" + color + ", type=" + type + "]";
	}
	

}
