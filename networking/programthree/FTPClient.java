import java.net.*;
import java.io.*;

/**
 *
 * @author jaseem
 */

class FTPClient{
    public static void main(String[] args){
        
        String fileName;
        File file;
        FileOutputStream fileOutputStream = null;
        
        
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
    
        Socket socket = null;
        byte[] byteArray;
    
        try {
    
            socket = new Socket("localhost", 7313); //connect server on "localhost" and port 7313
            System.out.println("Connected..."); 

            inputStream = socket.getInputStream(); //get input stream of server to receive data
            
            dataInputStream = new DataInputStream(inputStream); //create DataInputStream to receive string i.e, file name in this example
            
            fileName = dataInputStream.readUTF(); //filename server is sending
            file = new File(fileName); //create file object to store the received file content from server.
            fileOutputStream = new FileOutputStream(file); //file output stream to write the content to file received from server.
            
            int bytesRead = 0; //a variable to indicate bytes read from server in one iteration of below while loop.
            byteArray = new byte[1024 * 10];

            while((bytesRead = inputStream.read(byteArray)) > -1){ //read the content and save it in byteArray
                fileOutputStream.write(byteArray, 0, bytesRead); //writing the saved content of byteArray to file
            }
            
            System.out.println("Received Successfully...");
            fileOutputStream.close(); // close the file stream
            socket.close(); //close the connection.

        } catch (IOException e) {
            System.err.println("Error 1");
            e.printStackTrace();
        }
    }

}
