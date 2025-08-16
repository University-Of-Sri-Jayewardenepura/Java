// PolymorphismDemo.java
// Demonstrates compile-time and runtime polymorphism in Java.

// Superclass
class Shape {
	void draw() {
		System.out.println("Drawing a shape");
	}
}

// Subclass 1
class Circle extends Shape {
	void draw() {
		System.out.println("Drawing a circle");
	}
}

// Subclass 2
class Square extends Shape {
	void draw() {
		System.out.println("Drawing a square");
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		// Superclass reference to subclass objects
		Shape s1 = new Circle();
		Shape s2 = new Square();
		s1.draw(); // Calls Circle's draw()
		s2.draw(); // Calls Square's draw()
	}
}
