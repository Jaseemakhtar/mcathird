/**
 *
 * @author jaseem
 */

class ExceptionDemo{
	public static void main(String[] args){
		int a = 4;
		int b = 3;
		int c;
		int arr[] = new int[4];

		try{
			arr[a] = 10;
			c = arr[b] / 0;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);	
		}finally{
			System.out.println("\nfinally block is always executed whether exception is handled or not.");
		}
	}
}