
public class Shoop {
	private int tailLength;
	private String shape;

	public Shoop(int tailLength, String shape) {
		this.tailLength = tailLength;
		this.shape = shape;
		System.out.println("Creating shoop with tail length " + tailLength);
	}

	public void lengthenTail() {
		this.tailLength = this.tailLength + 2;
	}

	public void describeShoop(){
		System.out.println("My tail length is "+ tailLength + " and I am a " + shape);
	}
	
	public static void main(String[] args) {
		Shoop bob = new Shoop(2, "triangle");
		bob.lengthenTail();
		bob.describeShoop();
	}
}
