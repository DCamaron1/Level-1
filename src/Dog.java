
public class Dog {
	private String dogName;
	private int dogAge;
	private static int count;

	public Dog(String dogName, int dogAge) {
		this.dogName = dogName;
		this.dogAge = dogAge;
		count = count + 1;
	}

	public void setAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public int getAge() {
		return dogAge;
	}

	public static int getCount() {
		return count;
	}

	public String toString() {
		return dogName + " is " + dogAge + " years old";
	}

}
