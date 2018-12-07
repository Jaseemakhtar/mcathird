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
        byte[] rBytes = new byte[1024];
        String msg;
        String str;
        int n = 0;
        try {
            sock = new DatagramSocket(7313);
            
            System.out.println("Server started");
            packet = new DatagramPacket(rBytes, 0, rBytes.length);
            
            while(n < 5){
                sock.receive(packet);
                msg = new String(rBytes);
                System.out.println(packet.getAddress().toString() + ": is Pinging");
                byte[] sBytes;
                str = "dummy packet";
                sBytes = str.getBytes();
                DatagramPacket sPacket = new DatagramPacket(sBytes,0, sBytes.length, InetAddress.getByName("localhost"), 7312);
                sock.send(sPacket);
                n++;
            }
        } catch (SocketException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}