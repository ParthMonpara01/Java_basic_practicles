public class Practicle4 {

	public static void main(String[] args){
		//Use case of While loop and do while loop
		int num = 1;
		while(num <= 10){
			System.out.println(num);
			++num;
			System.out.println("while loop");
		}

		do {
			System.out.println(num);
			num++;
			System.out.println("do while loop");
		}while(num <=10);
	}

}