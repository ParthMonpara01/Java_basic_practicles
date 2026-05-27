public class Practicle15SingleInhe {
	//Single Inheritance
	public void Test1(){
		System.out.println("Parent Class Method");
	}
	public static void main(String[] args){
		Test t = new Test();

		//Calling Parent Class's Method from child class Object
		t.Test1();
	}
}

class Test extends Practicle15SingleInhe{

}