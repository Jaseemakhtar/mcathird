import java.net.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaseem
 */
public class UDPClient {
    public static void main(String[] args){
        DatagramSocket datagramSocket;
        DatagramPacket datagramPacket;
        String userInput;

        InetAddress ipAddr;
        Scanner scanner = new Scanner(System.in);
        byte[] bytes = new byte[1024];
        
        try{
            datagramSocket = new DatagramSocket(7314); //created client on different port
            ipAddr = InetAddress.getByName("localhost"); //if server is at different machine you can write it's ip address instead of localhost
            System.out.println("Write msg to send");
            userInput = scanner.nextLine();
            bytes = userInput.getBytes();
            datagramPacket = new DatagramPacket(bytes, bytes.length, ipAddr, 7313);
            datagramSocket.send(datagramPacket);
            scanner.close();
        } catch (SocketException ex) {
            System.out.println(ex);
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
