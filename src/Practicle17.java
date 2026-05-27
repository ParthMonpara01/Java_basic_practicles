// Interface
interface Animal1 {

	void sound(); // abstract method
}

// Implementing Interface
class Dog1 implements Animal1 {

	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

class Cat implements Animal1 {

	@Override
	public void sound() {
		System.out.println("Cat meows");
	}
}

// Main Class
public class Practicle17 {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();
	}

}