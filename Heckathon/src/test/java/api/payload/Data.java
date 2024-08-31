package api.payload;

public class Data {
	
	private String color;
	private String capacity;
	
	
	public Data(String color, String capacity) {
	
		this.color = color;
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapactiy(String capacity) {
		this.capacity = capacity;
	}	

}
