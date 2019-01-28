package no.hvl.dat102.appendixA.b2;

public class Kennel {

	public static void main(String[] args) {
		Dog d1 = new Dog("Bitty", 6);
		Dog d2 = new Dog("Titty", 9);
		System.out.println(d1.toString() + "\n" + d2.toString());
		d1.setAge(14);
		System.out.println(d1.toString() + "\n" + d2.toString());
	}

}
