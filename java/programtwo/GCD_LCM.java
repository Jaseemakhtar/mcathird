import java.util.*;
/**
 *
 * @author jaseem
 */
public class GCD_LCM {
    public static void main(String[] args) {
        int gcd, lcm, n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = input.nextInt();
        n2 = input.nextInt();
        gcd = gcd(n1, n2);
	  System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + ((n1 * n2) / gcd) );
        
    }
	
	public static int gcd(int n1, int n2){
		while(n1 != n2){
            if(n1 > n2){
                n1 -= n2;
            }else{
                n2 -= n1;
            }
        }
		return n1;
	}   
}
