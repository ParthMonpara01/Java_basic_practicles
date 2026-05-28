// ---------------- SINGLE INHERITANCE ----------------
class Animals {

	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dogs extends Animals {
	void bark() {
		System.out.println("Dog is barking");
	}
}

// ---------------- MULTILEVEL INHERITANCE ----------------
class GrandFather {
	void house() {
		System.out.println("GrandFather owns a house");
	}
}

class Father extends GrandFather {
	void car() {
		System.out.println("Father owns a car");
	}
}

class Son extends Father {
	void bike() {
		System.out.println("Son owns a bike");
	}
}

// ---------------- HIERARCHICAL INHERITANCE ----------------
class Shape {
	void display() {
		System.out.println("This is a shape");
	}
}

class Circle extends Shape {
	void drawCircle() {
		System.out.println("Drawing Circle");
	}
}

class Rectangle extends Shape {
	void drawRectangle() {
		System.out.println("Drawing Rectangle");
	}
}

// ---------------- HYBRID INHERITANCE ----------------
// Java supports hybrid inheritance using interfaces

interface Printer {
	void print();
}

class Computer {
	void show() {
		System.out.println("Computer class");
	}
}

class Laptop extends Computer implements Printer {

	public void print() {
		System.out.println("Laptop is printing");
	}
}

// ---------------- MAIN CLASS ----------------
public class Practical15 {

	public static void main(String[] args) {

		// Single Inheritance
		System.out.println("----- Single Inheritance -----");
		Dogs d = new Dogs();
		d.eat();
		d.bark();

		// Multilevel Inheritance
		System.out.println("\n----- Multilevel Inheritance -----");
		Son s = new Son();
		s.house();
		s.car();
		s.bike();

		// Hierarchical Inheritance
		System.out.println("\n----- Hierarchical Inheritance -----");

		Circle c = new Circle();
		c.display();
		c.drawCircle();

		Rectangle r = new Rectangle();
		r.display();
		r.drawRectangle();

		// Hybrid Inheritance
		System.out.println("\n----- Hybrid Inheritance -----");

		Laptop l = new Laptop();
		l.show();
		l.print();
	}

}