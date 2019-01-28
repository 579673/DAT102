package no.hvl.dat102.appendixA.b2;

public class Dog {
	private String name;
	private int age;
	
	//Constructor
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Get/set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//dogyears
	public int dogYears() {
		return age * 7;
	}
	//toString
	@Override
	public String toString() {
		return "This dog is named " + name + " he/she is " + age + " years old, that's " + dogYears() + " in dog years!";
	}
}
