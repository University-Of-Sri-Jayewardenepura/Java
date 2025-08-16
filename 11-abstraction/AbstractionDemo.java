// AbstractionDemo.java
// Demonstrates abstraction using abstract classes and interfaces in Java.

// Abstract class
abstract class Vehicle {
	// Abstract method
	abstract void start();
}

// Concrete subclass
class Car extends Vehicle {
	void start() {
		System.out.println("Car starts with key");
	}
}

// Interface
interface Flyable {
	void fly();
}

// Class implementing interface
class Plane implements Flyable {
	public void fly() {
		System.out.println("Plane is flying");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		// Abstract class reference to subclass
		Vehicle v = new Car();
		v.start();

		// Interface reference to implementing class
		Flyable f = new Plane();
		f.fly();
	}
}
