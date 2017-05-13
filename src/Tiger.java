
public class Tiger {
	private String color;
	
	public Tiger(String tigerColor){
		this.color=tigerColor;
		System.out.println("My color is " + color);
	}
	
	public void setColor(String newColor){
		color=newColor;
		System.out.println("My color is " + newColor);
	}
	
	public String getColor(){
		return color;
	}
	
	public static void main(String[] args) {
		Tiger rory = new Tiger("blue");
		rory.getColor();
		rory.setColor("red");
	}
}
