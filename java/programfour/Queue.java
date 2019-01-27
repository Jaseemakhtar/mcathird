import java.util.*;

/**
 *
 * @author jaseem
 */

public class Queue {
    public static int MAX = 10;
    public static int[] queue = new int[MAX];
    public static int rear = 0;
    public static int front = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        
        while(true){
            System.out.println("");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter any option: ");
            option = input.nextInt();

            switch(option){
                case 1:           
                    System.out.println("Enter the value to enter");
                    int val = input.nextInt();
                    insert(val);
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;      
            }
        }
    }
 
    public static void insert(int val){
        if(rear >= MAX){
            System.out.println("Queue is full");
            System.out.println("");
            return;
        }
        queue[rear] = val;
        rear++;
    }
    
    public static void delete(){
        System.out.println("");
        if(rear <= 0){
            System.out.println("queue is empty");
            System.out.println("");
            return;
        }
        
		System.out.println("deleted: " + queue[front]);
		
        for(int i = front; i < rear - 1; i++){
            int temp = queue[i + 1];
            queue[i] = temp;
        }
		rear--;
    }
    
    public static void display(){
        System.out.println("");
        if(rear <= 0){
            System.out.println("queue is empty");
            System.out.println("");
            return;
        }
        
        System.out.println("Element in the queue are: ");
        for(int i= 0; i < rear; i++){
            System.out.println(queue[i]);
        }
    }   
}
