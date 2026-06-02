import java.io.FileWriter;
import java.io.IOException;

public class Practicle24 {

	public static void main(String[] args) {

		try {
			// Creating FileWriter object to create and write file
			FileWriter writer = new FileWriter("myTestFile.txt");

			// Writing personal details
			writer.write("Name: John Doe\n");
			writer.write("Age: 20\n");
			writer.write("Course: MCA\n");
			writer.write("City: Ahmedabad\n");
			writer.write("Skills: Java,React\n");

			// Closing the file
			writer.close();

			System.out.println("File created and data written successfully.");

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}