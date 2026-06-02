public class Practical4 {

	public static void main(String[] args){
		// Use case of While loop and do while loop
		int num = 1;
		do {
			System.out.println(num);
			num++;
			System.out.println("loop");
		} while(num <=10);

		while(num <= 10){
			System.out.println(num);
			++num;
			System.out.println("loop");
		}
	}

}