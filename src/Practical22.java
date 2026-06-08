import java.util.*;

/**
 * Writing a program to remove duplicate in LinkedList in Java
 */
public class Practical22 {

	public static void main(String[] args) {

		// Creating list with duplicate values
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");

		System.out.println("Original List:");
		System.out.println(list);

		// Removing duplicates using LinkedHashSet
		Set<String> set = new HashSet<>(list);

		System.out.println("List after removing duplicates:");
		System.out.println(set);
	}

	//Java will iterate internally after writing code like "System.out.println(list);"
	//System.out.println(list.toString());
	//after that java will create String like [A, B, C, D] and we'll get output by writing System.out.println(list);

	//We used LinkedHashSet to remove the duplicates
	//Set will no store duplicates
	//Normal HashSet may change the order of the value
	//But LinkedHashSet will Maintain the order of the value

}