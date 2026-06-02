import java.util.Scanner;

/**
 * Writing a program of use Wrapper class
 */
class WrapperCompare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input values
		System.out.print("Enter first number: ");
		Integer num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		Integer num2 = sc.nextInt();

		// Using equals() method
		if (num1.equals(num2)) {
			System.out.println("Both numbers are equal.");
		} else {
			System.out.println("Numbers are not equal.");
		}

		// Using compareTo() method
		int result = num1.compareTo(num2);
		System.out.println(result);

		sc.close();
	}

}