class ConstructorDemo{
	private String name;
	private String rollno;
	
	public String getName(){
		return name;
	}

	public String getRollno(){
		return rollno;
	}

	
	public void setName(String name){
		this.name = name;
	}

	public void setRollno(String rollno){
		this.rollno = rollno;
	}

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
		System.out.println("Name: " + cD.getName() );
		System.out.println("RollNo: " + cD.getRollno() );		
	}
}

