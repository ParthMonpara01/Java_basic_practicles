/**
 * Writing a program for while loop and do-while loop
 */
public class Practical4 {

	public static void main(String[] args){
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