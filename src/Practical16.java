/**
 * Writing a program of Polymorphism in Java
 */
public class Practical16 {

	public static void main(String[] args) {
		Practical16 p16 = new Practical16();
		p16.Method1();
		p16.Method1(10);
		p16.Method1("Parth Monpara");
	}

	public void Method1() {
		System.out.println("Method-1");
	}

	public void Method1(int num) {
		System.out.println("My Age is : " + num);
	}

	public void Method1(String name) {
		System.out.println("My Name is " + name);
	}

}

class ChildClass extends Practical16 {
	public void Method1() {
		System.out.println("PolymorphismInJava2 Method Called..");
	}

	public void Method1(String name) {
		System.out.println("PolymorphismInJava2 Method-1 called...");
		System.out.println("My Name is " + name);
	}

}