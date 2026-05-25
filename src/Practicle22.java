import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Practicle22 {
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
		Set<String> set = new LinkedHashSet<>(list);

		System.out.println("List after removing duplicates:");
		System.out.println(set);
	}
}