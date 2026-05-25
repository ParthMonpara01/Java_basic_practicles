public class Practicle18 {
	final int num = 10;
	public static void main(String[] args){
		Practicle18 eh = new Practicle18();
		eh.checkException();
	}

	void checkException(){
		try{
			int result = num / 0;

		} catch (Exception e) {
			System.out.println("Exception Throws : Divisible by Zero ");
		}finally {
			System.out.println("Finally Block Always Executes");
		}
	}

}
