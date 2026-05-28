import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practical25 {

	public static void main(String[] args) {

		try {

			// File Handling
			File file = new File("myTestFile.txt");

			// Input Handling
			Scanner sc = new Scanner(file);

			System.out.println("Reading File Data:\n");

			// Loop for reading file line by line
			while (sc.hasNextLine()) {

				// String Handling
				String data = sc.nextLine();

				System.out.println(data);

				// Example string operations
				System.out.println("Uppercase: "
						+ data.toUpperCase());

				System.out.println("Length: "
						+ data.length());

				System.out.println();
			}

			sc.close();

		} catch (FileNotFoundException e) {

			// Exception Handling
			System.out.println("File not found: "
					+ e.getMessage());
		}
	}

}