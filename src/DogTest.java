
public class DogTest {
	public static void main(String[] args) {
		Dog snoopy= new Dog("Snoopy", 10);
		System.out.println(snoopy);
		snoopy.setAge(11);
		System.out.println(snoopy);
		System.out.println(Dog.getCount());
		Dog fido = new Dog("Fido",2);
		System.out.println(fido);
		fido.setAge(11);
		System.out.println(fido);
		System.out.println(Dog.getCount());

	}
}
