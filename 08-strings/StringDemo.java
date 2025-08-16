// StringDemo.java
// Demonstrates string creation and common string methods in Java.

public class StringDemo {
	public static void main(String[] args) {
		// String creation using literal
		String s = "Hello";
		// Convert to uppercase
		System.out.println(s.toUpperCase());

		// String concatenation
		String s2 = s.concat(" World");
		System.out.println(s2);

		// StringBuilder for mutable strings
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" Programming");
		System.out.println(sb);
	}
}
