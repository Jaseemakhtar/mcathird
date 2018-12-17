class ConstructorDemo{
	String name;
	String rollno;
	

	public ConstructorDemo(){
		name = "";
		rollno = "";
	}

	public ConstructorDemo(String name, String rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public static void main(String[] args){
		ConstructorDemo cD = new ConstructorDemo("Jaseem", "m181003");
		System.out.println("Name: " + cD.name );
		System.out.println("RollNo: " + cD.rollno );		
	}
}

