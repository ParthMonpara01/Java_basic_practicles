import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Practicle23 {

	public static void main(String[] args) {

		try {

			// Writing data into file
			FileWriter fw = new FileWriter("demo.txt");

			fw.write("Hello Java");

			fw.close();

			System.out.println("Data written successfully...	");

			// Reading data from file
			FileReader fr = new FileReader("demo.txt");

			int i;

			while ((i = fr.read()) != -1) {

				System.out.print((char) i);
			}

			fr.close();

		} catch (IOException e) {

			System.out.println(e);
		}
	}

}