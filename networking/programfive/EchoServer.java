import java.net.*;
import java.io.*;

/**
 *
 * @author jaseem
 */

class EchoServer{
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket client = null;
        String clientMsg;

        InputStream inputStream = null;
        OutputStream outputStream = null;

        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;

        try 
        {
            serverSocket = new ServerSocket(7313); //creating server
            System.out.println("Server started...");
            client = serverSocket.accept(); //waiting until client get's connected
            System.out.println("Client connected...");

            inputStream = client.getInputStream(); //client input stream to get input from client
            outputStream = client.getOutputStream(); //client output stream to echo back the msg

            dataInputStream = new DataInputStream(inputStream); 
            dataOutputStream = new DataOutputStream(outputStream); //DataInput & DataOutputStream to work with strings

            clientMsg = dataInputStream.readUTF(); //read msg from client
            System.out.println("Echoing...");
            dataOutputStream.writeUTF(clientMsg); // send (echo) it back to client

            serverSocket.close(); //close the connection
        }catch(IOException e){
            System.out.println(e);
        }
    }
}