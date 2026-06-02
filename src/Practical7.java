//Writing Program of Parameterized and Non-Parameterized constructor
public class Practical7 {

	public static void main(String[] args){
		Practical7 p7 = new Practical7(10,10);
	}
	// non-parameterized contructor
	public Practical7(){
		System.out.println("non parameterized Constructor");
	}

	// Parameterized Contructor
	public Practical7(int a, int b){
		int c = a + b;
		System.out.println("Parameterized Constuctor : " + c);
		System.out.println("Changed parameterize ");
	}

}