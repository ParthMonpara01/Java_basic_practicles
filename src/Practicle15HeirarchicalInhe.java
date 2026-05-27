public class Practicle15HeirarchicalInhe {
	public void Test1(){
		System.out.println("Parent class method calling in heirarchical Inheritance");
	}
	public static void main(String[] args){
		A a = new A();
		B b = new B();
	}
}

class A extends Practicle15HeirarchicalInhe{

}

class B extends Practicle15HeirarchicalInhe{

}