import java.net.*;
import java.io.*;

/**
 *
 * @author jaseem
 */
class RCEServer {

    public static void main(String[] args) {
           ServerSocket server;
           Socket client;
           OutputStream os;
           InputStream is;
           InputStream commandInputStream;
           DataInputStream dis;
           
           String[] command;
           Process process;
           ProcessBuilder pB = new ProcessBuilder();
           try{ 
               server = new ServerSocket(7313);
               System.out.println("Server started...");
               client = server.accept();
               System.out.println("Client connected: " + client.getInetAddress());
               os = client.getOutputStream();
               is = client.getInputStream();
               
               dis = new DataInputStream(is);
               
               String cmd = dis.readUTF();
               cmd = cmd.trim();
               command = cmd.split(" ");
               
               process = pB.command(command).start();
               
               commandInputStream = process.getInputStream();
               
               int read;
               byte[] bytes = new byte[1024 * 4];
               while((read = commandInputStream.read(bytes)) > 0){
                   os.write(bytes, 0, read);
               }
               System.out.println("Command: " + cmd + " successfully.");
               System.out.println("Server exited");
               server.close();
               
           }catch(IOException e){
               System.out.println(e.getMessage());
           }
    }
    
}
