public class MultilevelInherite {
	public static void main(String[] args){
		MultilevelInheritance3 ml3 = new MultilevelInheritance3();
		ml3.Method1();
	}

	public void Method1(){
		System.out.println("Method-1");
	}
}

class MultilevelInheritance2 extends MultilevelInherite{
	public void Method2(){
		System.out.println("Method-2");
	}
}

class MultilevelInheritance3 extends MultilevelInheritance2{
	public void Method3(){
		System.out.println("Method-3");
	}
}
