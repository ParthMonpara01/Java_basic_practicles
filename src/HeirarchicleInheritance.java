public class HeirarchicleInheritance {
	public static void main(String[] args){
		SecondClass sc = new SecondClass();
		ThirdClass tc = new ThirdClass();

		tc.Method1();
		sc.Method1();
	}

	public void Method1(){
		System.out.println("Main Method");
	}
}

class SecondClass extends HeirarchicleInheritance{
	public void Method2(){
		System.out.println("SecondClass Method");
	}
}

class ThirdClass extends HeirarchicleInheritance{
	public void Method2(){
		System.out.println("Third class Method");
	}
}


class Fourth extends HeirarchicleInheritance{
	public void Method2(){
		System.out.println("Fourth Method");
	}
}