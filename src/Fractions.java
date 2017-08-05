
public class Fractions {
	public int numerator;
	private int denominator;
	
	public Fractions(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public float getValue(){
		float floats = numerator;
		return numerator/(float)denominator; 
	}
	
	public void setDenominator(int denominator){
		this.denominator=denominator;
		if(denominator==0){
			System.out.println("Invalid input");
		}
	}
}
