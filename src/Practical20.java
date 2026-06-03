import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Writing a program of ArrayList operation in Java
 */
public class Practical20 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Hello");
		list.add("World");
		list.add("YourName");
		list.add("Java");

		// Using Iterator to print values
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}