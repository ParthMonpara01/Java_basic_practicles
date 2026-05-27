import java.util.Scanner;

// Class Declaration
class EMICalculator {

	// Variables (Datatypes)
	double principal;
	double annualRate;
	int time;

	// Method to calculate EMI
	void calculateEMI() {

		// Monthly interest rate
		double monthlyRate = annualRate / (12 * 100);

		// Total number of monthly installments
		int months = time * 12;

		// EMI Formula..
		double emi = (principal * monthlyRate *
				Math.pow(1 + monthlyRate, months))
				/ (Math.pow(1 + monthlyRate, months) - 1);

		// Output..cdcdwe
		System.out.println("Loan Amount : " + principal);
		System.out.println("Interest Rate : " + annualRate + "%");
		System.out.println("Loan Period : " + time + " years");
		System.out.println("Monthly EMI : " + emi);
	}
}

// Main Class
public class Practicle8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Object Creation
		EMICalculator obj = new EMICalculator();

		// Input from user
		System.out.print("Enter Loan Amount: ");
		obj.principal = sc.nextDouble();

		System.out.print("Enter Annual Interest Rate: ");
		obj.annualRate = sc.nextDouble();

		System.out.print("Enter Loan Time (Years): ");
		obj.time = sc.nextInt();

		// Method Call
		obj.calculateEMI();

		sc.close();
	}

}