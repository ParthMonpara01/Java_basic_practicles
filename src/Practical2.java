import java.util.Scanner;

/**
 * Writing a program for if-else condition
 */
public class Practical2 {

	public static void main(String[] args) {
		//Writing a programm to use cases of If-else statement.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age");

		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Your age is more than 18");
		} else if (age < 18) {
			System.out.println("Your age is less than 18");
		} else {
			System.out.println("Your age is 18");
		}
	}

}