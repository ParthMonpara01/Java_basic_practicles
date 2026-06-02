public class PolymorphismInJava {

	public static void main(String[] args) {
		PolymorphismInJava pij = new PolymorphismInJava();
		PolyporphismInJava2 pij2 = new PolyporphismInJava2();
		pij2.Method1();
		pij.Method1("Parth Monpara");
	}

	public void Method1(){
		System.out.println("Method-1");
	}

	public void Method1(int num){
		System.out.println("My Age is : " + num);
	}

	public void Method1(String name){
		System.out.println("My Name is " + name);
	}

}

class PolyporphismInJava2 extends PolymorphismInJava{
	public void Method1(){
		System.out.println("PolymorphismInJava2 Method Called..");
	}

	public void Method1(String name){
		System.out.println("PolymorphismInJava2 Method-1 called...");
		System.out.println("My Name is " + name);
	}

}