// OOPConcepts.java
// Demonstrates basic OOP concepts: class, object, and method.

// Class definition
class Dog {
	// Attribute (instance variable)
	String name;

	// Method definition
	void bark() {
		// Print dog's name and bark
		System.out.println(name + " says Woof!");
	}
}

public class OOPConcepts {
	public static void main(String[] args) {
		// Create Dog object
		Dog d = new Dog();
		d.name = "Buddy"; // Set name
		d.bark(); // Call method
	}
}
