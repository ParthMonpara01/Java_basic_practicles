//Single inheritance
public class SingleInherite {
	public static void main(String[] args){
		DataInherite2 d2 = new DataInherite2();
		d2.Method1();
	}
	public static void Method1(){
		System.out.println("Datainherite Class Method");
	}
}

class DataInherite2 extends SingleInherite{

}


