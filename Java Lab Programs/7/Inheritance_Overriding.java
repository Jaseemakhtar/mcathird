public class Inheritance_Overriding{
	public static void main(String[] args){
		Manager manager = new Manager();
		manager.setName("Jaseem");
		manager.setId(7313);

		System.out.println("Name: " + manager.getName() );
		System.out.println("Id: " + manager.getId() );
		System.out.print("Work: " + manager.doesWork());				
	}
}

class Employee{
	private String name;
	private int id;
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}

	public String doesWork(){
		return "Some Work";
	}
}

class Manager extends Employee{
	public String doesWork(){
		return "Sets goals for group or organization";
	}
}

