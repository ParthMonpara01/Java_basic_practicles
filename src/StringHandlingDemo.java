public class StringHandlingDemo {

	public static void main(String[] args) {

		String str = "Hello Java";

		System.out.println("Original String: " + str);

		// Length
		System.out.println("Length: " + str.length());

		// Uppercase
		System.out.println("Uppercase: " + str.toUpperCase());

		// Lowercase
		System.out.println("Lowercase: " + str.toLowerCase());

		// Replace
		System.out.println("Replace: "
				+ str.replace("Java", "World"));

		// Contains
		System.out.println("Contains Java: "
				+ str.contains("Java"));
	}

}