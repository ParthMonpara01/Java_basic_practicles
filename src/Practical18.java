/**
 * Writing a program of Exception Handling in Java
 */
class ExceptionDemo {

	// throws keyword
	static void checkAge(int age) throws ArithmeticException {

		// throw keyword
		if (age < 18) {
			throw new ArithmeticException("Not eligible for voting");
		} else {
			System.out.println("Eligible for voting");
		}
	}
}

public class Practical18 {

	public static void main(String[] args) {

		try {

			// Exception generating code
			int number = 10 / 0;

			System.out.println(number);

		} catch (ArithmeticException e) {

			// catch block
			System.out.println("Exception Caught: " + e);

		} finally {

			// finally block
			System.out.println("Finally block always executes");
		}

		// Calling method
		try {
			ExceptionDemo.checkAge(15);

		} catch (ArithmeticException e) {

			System.out.println("Custom Exception: " + e.getMessage());
		}
	}

}