/**
 *
 * @author jaseem
 */

class UserDefinedException{
	public static void main(String[] args){
			int a = 0;
			
			try{
				if( a < 1)
					throw new MyException();
			}catch(MyException e){
				System.out.println(e.getMessage());
			}
	}
}


class MyException extends Exception{
	public String getMessage(){
		return "The number is less than one";
	}
}

