import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author jaseem
 */
public class PingClient {
    public static void main(String[] args){
        DatagramSocket socket;
        DatagramPacket packet;
        InetAddress ipaddr;
        byte[] bytes = new byte[1024];
        int n = 0;
        String str;
        
        try{
            socket = new DatagramSocket(7312);
            ipaddr = InetAddress.getByName("localhost");
            while(n < 5){
                long msSend = Calendar.getInstance().get(Calendar.MINUTE);
                str = "PING " + n + " " + msSend + " \n";
                bytes = str.getBytes();
                packet = new DatagramPacket(bytes, bytes.length, ipaddr, 7313);
                socket.send(packet);
                
                
                try{
                    byte[] rBytes = new byte[1024];
                    DatagramPacket rPacket = new DatagramPacket(rBytes, 0, rBytes.length);
                    socket.setSoTimeout(5000);
                    socket.receive(rPacket);
                    String msg = new String(rBytes);
                    System.out.println(msg);
                }catch(IOException ex){
                    System.out.println("Timeout: " + n);
                }
                n++;
            }
            
            
        } catch (SocketException ex) {
            System.out.println(ex.getMessage());
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
