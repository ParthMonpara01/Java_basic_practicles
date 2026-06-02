/**
 * Writing a program of Interface in Java
 */
interface SampleIntergace {

	void method1();
}

class Second implements SampleIntergace {

	@Override
	public void method1() {
		System.out.println("Providing Body Of Interface Method");
	}
}

public class Practicle17 {
	public static void main(String[] args) {

		Second s = new Second();
		s.method1();
	}

}