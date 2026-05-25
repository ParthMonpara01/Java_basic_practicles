//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

	// Star Pattern
	public static void pattern1(){
		for(int i = 0;i < 5;i++){
			for(int j = 0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
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

	//non-parameterized contructor
	public Main(){
		System.out.println("non parameterized Constructor");
	}

	//Parameterized Contructor
	public Main(int a,int b){
		int c = a + b;
		System.out.println("Parameterized Constuctor Output : " + c);
	}



}