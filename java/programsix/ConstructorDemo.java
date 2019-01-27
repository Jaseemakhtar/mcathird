/**
 *
 * @author jaseem
 */
class ConstructorDemo{
	String name = "none";
	String rollno = "none";
	

	public ConstructorDemo(){
	}

	public ConstructorDemo(String name, String rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args){
ConstructorDemo cd = new ConstructorDemo("Jaseem",  "m181003");
		System.out.println("Name: " + cd.name );
		System.out.println("RollNo: " + cd.rollno );
		ConstructorDemo cd2 = new ConstructorDemo();
		System.out.println("Name: " + cd2.name );
		System.out.println("RollNo: " + cd2.rollno );
	}
}