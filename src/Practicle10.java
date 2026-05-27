public class Practicle10 {

	public static void main(String[] args) {

		// Creating Strings
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "hello";

		// charAt()
		System.out.println("charAt(1): " + str1.charAt(1));

		// concat()
		System.out.println("concat(): " + str1.concat(" " + str2));

		// equals()
		System.out.println("equals(): " + str1.equals(str2));

		// equalsIgnoreCase()
		System.out.println("equalsIgnoreCase(): "
				+ str1.equalsIgnoreCase(str3));

		// length()
		System.out.println("length(): " + str1.length());

		// toUpperCase()
		System.out.println("toUpperCase(): "
				+ str1.toUpperCase());

		// toLowerCase()
		System.out.println("toLowerCase(): "
				+ str2.toLowerCase());

		// substring()
		System.out.println("substring(1,4): "
				+ str1.substring(1,4));

		// contains()
		System.out.println("contains('ell'): "
				+ str1.contains("ell"));

		// replace()
		System.out.println("replace(): "
				+ str1.replace('l', 'p'));

		// startsWith()
		System.out.println("startsWith('He'): "
				+ str1.startsWith("He"));

		// endsWith()
		System.out.println("endsWith('lo'): "
				+ str1.endsWith("lo"));

		// indexOf()
		System.out.println("indexOf('l'): "
				+ str1.indexOf('l'));

		// trim()
		String str4 = "   Java Programming   ";
		System.out.println("trim(): " + str4.trim());

		// isEmpty()
		String str5 = "";
		System.out.println("isEmpty(): " + str5.isEmpty());
	}

}