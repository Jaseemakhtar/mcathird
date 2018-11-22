import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author jaseem
 */

class Client{
    public static void main(String[] args){
        Socket socket = null;
        Scanner scan = new Scanner(System.in);
        String yourMsg, echo;

        InputStream inputStream = null;
        OutputStream outputStream = null;

        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;

        try{
            socket = new Socket("localhost", 7313); //connect server on "localhost" and port 7313
            System.out.println("Connected..."); 

            inputStream = socket.getInputStream(); //get input stream of server to receive data
            outputStream = socket.getOutputStream(); //get output stream of server to send msg for echoing
            
            dataInputStream = new DataInputStream(inputStream); //create DataInputStream to receive string 
            dataOutputStream = new DataOutputStream(outputStream); //create DataOutputStream to send msg in String 

            System.out.println("Enter msg to echo...");
            yourMsg = scan.nextLine(); //take command line input from user

            dataOutputStream.writeUTF(yourMsg); //send that taken input to server
            echo = dataInputStream.readUTF(); //read back the response from server

            System.out.println(echo);
            System.out.println("Echoed successfully");
 
            socket.close(); //close the connection
            scan.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}