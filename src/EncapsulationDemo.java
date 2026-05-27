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

public class EncapsulationDemo {
	public static void main(String[] args){
		Students s = new Students();
		s.setId(101);
		s.setName("Parth Monpara");


	}
}
