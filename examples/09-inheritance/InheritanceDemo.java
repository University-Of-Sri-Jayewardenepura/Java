// InheritanceDemo.java
// Demonstrates inheritance and method overriding in Java.

// Superclass
class Animal {
	// Method in superclass
	void eat() {
		System.out.println("Animal eats");
	}
}

// Subclass extends superclass
class Dog extends Animal {
	// Overriding method
	void eat() {
		System.out.println("Dog eats bones");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		// Create Dog object and call eat()
		Dog d = new Dog();
		d.eat();
	}
}
