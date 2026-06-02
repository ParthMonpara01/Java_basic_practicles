// Writing program of Star Pattern
public class Practical5 {

	public static void main(String[] args){
		pattern1();
	}

	public static void pattern1() {
		for (int i = 1; i <=6; i++){
			int count = 1;
			for (int j = 6 ;j >= 1;j--){
				if ((i >= 1 && i < j) && (j >=i && j <= 6)){
					System.out.print(" ");
				} else {
					System.out.print(count);
					count++;
				}
			}
			System.out.println();
		}
	}

}