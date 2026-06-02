/**
 * Writing a program of Encapsulation in Java
 */
class Students{

	int id;
	String Name;

	//Setter Methods
	void setId(int id){
		this.id = id;
	}

	void setName(String name){
		this.Name = name;
	}

	//Getter Method
	int getId(){
		return id;
	}

	String getName(){
		return Name;
	}
}

public class Practical14 {
	public static void main(String[] args) {
		Students s = new Students();
		s.setId(101);
		s.setName("Parth Monpara");
		System.out.println(s.getId());
		System.out.println(s.getName());

	}

}