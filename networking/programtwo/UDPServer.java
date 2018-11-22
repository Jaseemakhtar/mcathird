import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaseem
 */
public class UDPServer{
    
    public static void main(String[] args) {
        DatagramSocket datagramSocket;
        DatagramPacket datagramPacket;
        byte[] bytes;
        String msg;

        try {
            datagramSocket = new DatagramSocket(7313);
            System.out.println("UDP Server started...");
            bytes = new byte[1024];
            datagramPacket = new DatagramPacket(bytes, 0,  bytes.length);
            datagramSocket.receive(datagramPacket);
            msg = new String(bytes);
            System.out.println(msg);
        } catch (SocketException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }    
}