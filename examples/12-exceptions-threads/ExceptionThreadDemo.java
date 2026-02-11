// ExceptionThreadDemo.java
// Demonstrates exception handling and threading in Java.

// Exception handling example
class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a = 5 / 0; // This will cause ArithmeticException
		} catch (ArithmeticException e) {
			// Handle exception
			System.out.println("Exception caught: " + e);
		} finally {
			// Finally block always executes
			System.out.println("Finally block executed");
		}
	}
}

// Thread example
class MyThread extends Thread {
	public void run() {
		// Print thread name
		System.out.println("Thread running: " + getName());
	}
}

public class ExceptionThreadDemo {
	public static void main(String[] args) {
		// Create and start thread
		MyThread t = new MyThread();
		t.start();
	}
}
