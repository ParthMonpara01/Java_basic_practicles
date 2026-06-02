/**
 * Writing a program of Static keyword
 */
class StaticDemo {

	// Static Variable
	static int number = 100;

	// Static Block
	static {
		System.out.println("Static Block Executed");
	}

	// Static Method
	static void display() {
		System.out.println("Static Method Called");
		System.out.println("Value of Static Variable: " + number);
	}

}

public class Practical12 {

	public static void main(String[] args) {

		 // Accessing Static Variable
		System.out.println("Static Variable: " + StaticDemo.number);

		// Calling Static Method
		StaticDemo.display();
	}

}