import java.util.*;

/**
 *
 * @author jaseem
 */
public class PrimeNumber {

    public static void main(String[] args) {
	int m=0,flag=0;      
	int n = 0;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a Number :");

	n = Integer.valueOf(in.nextLine());
	m = n/2; 

	if( n == 0 || n == 1 )
	{  
		System.out.println(n+" is not prime number");      
	}else{  
		for(int i = 2; i <= m; i++)
		{      
		        if(n%i == 0)
			{      
				flag=1;      
				break;      
			}      
		}      
	}  

		if(flag==0)
		{ 
			System.out.println(n+" is prime number");
		}else{
			System.out.println(n+" is not prime number");      		
		}   
	}
}

