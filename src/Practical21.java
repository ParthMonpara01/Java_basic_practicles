import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * Writing a program of SET,MAP operation in Java
 */
public class Practical21 {

	public static void main(String[] args) {

		// ---------------- SET CONCEPT ----------------
		System.out.println("----- Set Example -----");

		Set<String> students = new HashSet<>();

		// Adding elements
		students.add("Parth");
		students.add("Rahul");
		students.add("Amit");
		students.add("Parth"); // Duplicate value

		// Printing Set
		System.out.println("Students Set: " + students);

		// ---------------- MAP CONCEPT ----------------
		System.out.println("\n----- Map Example -----");

		Map<Integer, String> studentMap = new HashMap<>();

		// Adding key-value pairs
		studentMap.put(101, "Parth");
		studentMap.put(102, "Rahul");
		studentMap.put(103, "Amit");

		// Printing Map
		System.out.println("Student Map: " + studentMap);

		// Accessing values
		System.out.println("Student with ID 101: " + studentMap.get(101));

		// Traversing Map
		System.out.println("\nTraversing Map:");

		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {

			System.out.println("ID: " + entry.getKey()
					+ " Name: " + entry.getValue());
		}
	}

}