public class Practicle16{

	public static void main(String[] args){
		Practicle16 p = new Practicle16();
		MethodOverride mo = new MethodOverride();
		mo.Test1("parth Monpara");
		p.Test1(10,20);
	}

	public void Test1(int a, int b){
		System.out.println("Addition of A and B is : " + (a+b));
	}

	public void Test1(String name){
		System.out.println("My Name is : " + name);
	}
}

class MethodOverride extends Practicle16{
	public void Test1(String name){
		System.out.println("Child Class Method ");
		System.out.println("My Name is : " + name);
	}

}