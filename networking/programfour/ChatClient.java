import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author jaseem
 */

class ChatClient{
    public static void main(String[] args){
        Socket socket = null;
        Scanner scan = new Scanner(System.in);
        String yourMsg, serverMsg;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        try{
            socket = new Socket("localhost", 7313); //connect server on "localhost" and port 7313
            System.out.println("Connected..."); 

            inputStream = socket.getInputStream(); //get input stream of server to receive data
            outputStream = socket.getOutputStream();
            
            dataInputStream = new DataInputStream(inputStream); //create DataInputStream to receive string 
            dataOutputStream = new DataOutputStream(outputStream);

            while(true){
                serverMsg = dataInputStream.readUTF();

                if(serverMsg.equals("exit")){
                    break; // exit the chat if server sends "exit"
                }

                System.out.println("Server: " + serverMsg);
                System.out.print("You: ");
                yourMsg = scan.nextLine();
                dataOutputStream.writeUTF(yourMsg);

                if(yourMsg.equals("exit")){
                    break; // exit the chat if client types "exit"
                }
            }
            socket.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}