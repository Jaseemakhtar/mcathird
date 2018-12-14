import java.util.*;
/**
 *
 * @author user
 */
public class GCD_LCM {

    public static void main(String[] args) {
        
        int gcd, lcm, n1, n2, tn1, tn2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = input.nextInt();
        tn1 = n1;
        n2 = input.nextInt();
        tn2 = n2;
        
        while(n1 != n2){
            if(n1 > n2){
                n1 -= n2;
            }else{
                n2 -= n1;
            }
        }

        gcd = n1;

	System.out.println("GCD: " + gcd);
       
        System.out.println("LCM: " + ((tn1 * tn2) / gcd) );
        
    }
    
}

