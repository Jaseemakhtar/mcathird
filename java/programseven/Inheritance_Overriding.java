/**
 *
 * @author jaseem
 */

public class Inheritance_Overriding{
	public static void main(String[] args){
		Manager manager = new Manager("Mr.Robot", 7313);
		
		System.out.println("Name: " + manager.name );
		System.out.println("Id: " + manager.id );
		System.out.print("Work: " + manager.doesWork());				
	}
}

class Employee{
	String name;
	int id;
	
	public Employee(String n, int i){
		name = n;
		id = i;
	}
	public String doesWork(){
		return "Some Work";
	}
}

class Manager extends Employee{
	public Manager(String n, int i){
		super(n, i);
	}
	public String doesWork(){
		return "Sets goals for group or organization";
	}
}