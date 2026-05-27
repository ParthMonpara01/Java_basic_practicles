public class Practicle7 {

	public static void main(String[] args){
		Practicle7 p7 = new Practicle7();
	}
	//non-parameterized contructor
	public Practicle7(){
		System.out.println("non parameterized Constructor");
	}

	//Parameterized Contructor
	public Practicle7(int a,int b){
		int c = a + b;
		System.out.println("Parameterized Constuctor : " + c);
		System.out.println("Changed parameterize ");
	}

}