// StudentDemo.java
// Demonstrates class, constructors, and methods in Java.

class Student {
	// Instance variables
	String name;
	int age;

	// Default constructor
	Student() {
		name = "Unknown";
		age = 0;
	}

	// Parameterized constructor
	Student(String n, int a) {
		name = n;
		age = a;
	}

	// Method to display student info
	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		// Create students using both constructors
		Student s1 = new Student();
		Student s2 = new Student("Alice", 20);
		s1.display();
		s2.display();
	}
}
