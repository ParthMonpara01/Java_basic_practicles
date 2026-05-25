import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practical25 {
	public static void main(String[] args) {

		BufferedReader reader = null;

		try {
			// Open the file for reading
			reader = new BufferedReader(new FileReader("myTestFile.txt"));

			String line;

			System.out.println("Reading file content:\n");

			// Reading file line by line using loop
			while ((line = reader.readLine()) != null) {

				// String handling example: converting to uppercase
				System.out.println(line.toUpperCase());
			}

		} catch (IOException e) {
			System.out.println("Error while reading the file.");
			e.printStackTrace();

		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing the file.");
			}
		}
	}
}