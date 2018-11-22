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
        
        String read;
        Scanner input = new Scanner(System.in);
        int option;
        
        while(true){
            print("");
            print("1.Insert");
            print("2.Delete");
            print("3.Display");
            print("4.Exit");
            print("Enter any option: ");
            read = input.nextLine();
            option = Integer.valueOf(read);
            switch(option){
                case 1:
                    
                    print("Enter the value to enter");
                    read  = input.nextLine();
                    int val = Integer.valueOf(read);
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
                    print("Invalid Option");
                    break;
                    
            }
        }
    }
 
    public static void print(Object msg){
        System.out.println(String.valueOf(msg));
    }
    
    public static void insert(int val){
        if(rear >= MAX){
            print("Queue is full");
            print("");
            return;
        }
        queue[rear] = val;
        rear++;
    }
    
    public static void delete(){
        print("");
        if(rear <= 0){
            print("queue is empty");
            print("");
            return;
        }
        
        for(int i=front; i < rear; i++){
            int temp = queue[i + 1];
            queue[i] = temp;
        }
        rear--;
    }
    
    public static void display(){
        print("");
        if(rear <= 0){
            print("queue is empty");
            print("");
            return;
        }
        
        print("Element in the queue are: ");
        for(int i= 0; i < rear; i++){
            print(queue[i]);
        }
    }
    
}

