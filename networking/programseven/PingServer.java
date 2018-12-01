import java.io.*;
import java.net.*;

/**
 *
 * @author jaseem
 */
public class PingServer {
    public static void main(String[] args){
        DatagramSocket sock;
        DatagramPacket packet;
        byte[] bytes = new byte[1024];
        String msg;
        
        try {
            sock = new DatagramSocket(7313);
            
            System.out.println("Server started");
            packet = new DatagramPacket(bytes, 0, bytes.length);
            
            while(true){
                sock.receive(packet);
                
                msg = new String(bytes);
                System.out.println(msg);
                
                byte[] sBytes = new byte[1024];
                sBytes = msg.getBytes();
                DatagramPacket sPacket = new DatagramPacket(bytes,0, bytes.length, InetAddress.getByName("localhost"), 7312);
                sock.send(sPacket);
                
            }
        } catch (SocketException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
