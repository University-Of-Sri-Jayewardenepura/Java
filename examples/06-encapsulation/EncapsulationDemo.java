// EncapsulationDemo.java
// Demonstrates encapsulation using private variables and getter/setter methods.

class Person {
	// Private variables (data hiding)
	private String name;
	private int age;

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String n) {
		name = n;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for age
	public void setAge(int a) {
		age = a;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		// Create Person object and set values
		Person p = new Person();
		p.setName("Bob");
		p.setAge(25);
		// Print details
		System.out.println(p.getName() + " is " + p.getAge() + " years old.");
	}
}
