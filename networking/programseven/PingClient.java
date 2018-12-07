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
        byte[] bytes;
        int n = 0;
        String str;
        long sTime;
        long rTime;
        long cTime;
        
        try{
            socket = new DatagramSocket(7312);
            ipaddr = InetAddress.getByName("localhost");
            
            while(n < 5){
                
                
                str = "dummy packet";
                bytes = str.getBytes();
                packet = new DatagramPacket(bytes, bytes.length, ipaddr, 7313);
                socket.send(packet);
                sTime = new Date().getTime();
                try{
                    byte[] rBytes = new byte[1024];
                    DatagramPacket rPacket = new DatagramPacket(rBytes, 0, rBytes.length);
                    socket.setSoTimeout(5000); //setting timeout
                    socket.receive(rPacket); //receive response
                    rTime = new Date().getTime();
                    cTime = rTime - sTime;
                    
                    System.out.println("Reply from " + rPacket.getAddress().toString() + ": time < " +
                            cTime + "ms");
                }catch(IOException ex){
                    System.out.println("Request Timeout: " + n);
                }
                Thread.sleep(1000);
                n++;
            }
            
            
        } catch (SocketException ex) {
            System.out.println(ex.getMessage());
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
