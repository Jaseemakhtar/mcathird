import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author jaseem
 */

class ChatServer{
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket client = null;
        Scanner scan = new Scanner(System.in);
        String yourMsg, clientMsg;

        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;

        try 
        {
            serverSocket = new ServerSocket(7313); //creating server
            System.out.println("Server started...");
            client = serverSocket.accept(); //waiting until client get's connected
            System.out.println("Client connected...");
            outputStream = client.getOutputStream(); //get the output stream to send data to client
            inputStream = client.getInputStream();
            dataOutputStream = new DataOutputStream(outputStream); //DataOutputStream is used to work with strings unlike output stream
            dataInputStream = new DataInputStream(inputStream);

            dataOutputStream.writeUTF("Hi from server");
            while(true){
                clientMsg = dataInputStream.readUTF();
                if(clientMsg.equals("exit")){
                    break; // exit the chat if client sends "exit"
                }

                System.out.println("Client: " + clientMsg);
                System.out.print("You: ");
                yourMsg = scan.nextLine();
                dataOutputStream.writeUTF(yourMsg);

                if(yourMsg.equals("exit")){
                    break; // exit the chat if server types "exit"
                }
            }

            serverSocket.close();
        }catch(IOException e){
            System.out.println(e);
        }

    }
}