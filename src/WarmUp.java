import java.util.Random;

public class WarmUp {
	public static void main(String[] args) {

		Random gen1 = new Random(7);
		Random gen2 = new Random(1);
		Random gen3 = gen1;
		System.out.println(gen1 == gen2);
		System.out.println(gen1.equals(gen2));
		System.out.println(gen2==gen3);
		System.out.println(gen2.equals(gen3));
		System.out.println(gen1==gen3);
		System.out.println(gen1.equals(gen3));
	}
}
