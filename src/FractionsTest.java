
public class FractionsTest {
	public static void main(String[] args) {
	Fractions f1 = new Fractions(4,6);
	System.out.println(f1.getValue());
	f1.setDenominator(0);
	System.out.println(f1.getValue());
	}
}
