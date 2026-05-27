public class Practicle6 {
	public static void main(String[] args){
		useBreakContinue();
	}
	//Using Break Keyword
	public static void useBreakContinue(){
		for (int i = 1;i <= 10;i++){
			if (i > 7){
				break;
			}

			System.out.print(i + " ");
		}
	}

}