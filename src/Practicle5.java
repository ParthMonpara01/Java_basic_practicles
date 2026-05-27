public class Practicle5 {

	public static void main(String[] args){
		pattern1();
	}

	// Star Pattern
	public static void pattern1(){
		for (int i = 1;i <=5;i++){
			for (int j = 5 ;j >=1;j--){
				if ((i >= 1 && i < j) && (j >=i && j <= 5)){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}

