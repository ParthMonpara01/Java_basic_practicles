abstract class Animal {
	//abstract Method
	abstract void sound();

	//Concrete Method
	public void eat(){
		System.out.println("Eate Method of class Practicle13");
	}
}

class Dog extends Animal{
	void sound(){
		System.out.println("Dog Barkes");
	}
}

public class Practice13{
	public static void main(String[] args){
		Dog d = new Dog();
		d.sound();
	}
}
