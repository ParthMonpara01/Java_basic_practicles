class Parent {
	int x = 10;

	void show() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent {

	int x = 20;
	static int count = 0;

	Child() {
		count++;
	}

	void display() {

		// this keyword (current class variable)
		System.out.println("Child x = " + this.x);

		// super keyword (parent class variable)
		System.out.println("Parent x = " + super.x);

		// calling parent method
		super.show();
	}

	static void showCount() {
		System.out.println("Objects created = " + count);
	}

	public static void main(String[] args) {

		Child c1 = new Child();
		Child c2 = new Child();

		c1.display();

		Child.showCount();
	}
}