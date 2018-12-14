import java.util.*;

/**
 *
 * @author jaseem
 */

public class Combination {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 0, k = 0;
        System.out.println("Enter the value for n");
        n = input.nextInt();
        
        System.out.println("Enter the value for k");
        k = input.nextInt();
        
        System.out.print(n + "C" + k + " = ");
        System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
    }
    
    public static int factorial(int n){
        int fact  = 1; 
        for(int i = n; i > 0; i--){
            fact *= i;
        }
        return fact;
    }
    
}

