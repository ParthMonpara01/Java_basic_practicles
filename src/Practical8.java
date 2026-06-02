import java.util.Scanner;

/**
 * Writing a program to calculate EMI
 */
class EMICalculator {

	// Variables (Datatypes)
	double principal;
	double annualRate;
	int time;

	// Method to calculate EMI
	void calculateEMI() {

		// Total number of monthly installments
		int months = time * 12;

		double interest = principal * annualRate * time / 100;

		double totalAmount = principal + interest;

		double emi = totalAmount / months;

		// Output..cdcdwe
		System.out.println("Loan Amount : " + principal);
		System.out.println("Interest Rate : " + annualRate + "%");
		System.out.println("Loan Period : " + time + " years");
		System.out.println("Monthly EMI : " + emi);
	}

}

// Main Class
public class Practical8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Object Creation
		EMICalculator obj = new EMICalculator();


		// Loan Amount Validation
		while (true) {

			System.out.print("Enter Loan Amount: ");
			obj.principal = sc.nextDouble();

			if (obj.principal > 0) {
				break;
			} else {
				System.out.println("Loan Amount must be greater than 0");
			}
		}


		// Interest Rate Validation
		while (true) {

			System.out.print("Enter Annual Interest Rate: ");
			obj.annualRate = sc.nextDouble();

			if (obj.annualRate > 0) {
				break;
			} else {
				System.out.println("Interest Rate must be greater than 0");
			}
		}


		// Time Validation
		while (true) {

			System.out.print("Enter Loan Time (Years): ");
			obj.time = sc.nextInt();

			if (obj.time > 0) {
				break;
			} else {
				System.out.println("Loan Time must be greater than 0");
			}
		}


		// Method Call
		obj.calculateEMI();

		sc.close();
	}

}