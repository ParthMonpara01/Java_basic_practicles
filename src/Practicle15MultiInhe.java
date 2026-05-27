//Multi-level Inheritance
public class Practicle15MultiInhe {
	public static void main(String[] args){

	}
}

class Test1 extends Practicle15SingleInhe{
	public void Test1(){
		System.out.println("Test1 Class Method");
	}
}

class Test2 extends Test1{
	public void Test2(){
		System.out.println("Test2 Class Method");
	}
}