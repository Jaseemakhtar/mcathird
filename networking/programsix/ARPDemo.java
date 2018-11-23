import java.util.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author jaseem
 */
public class ARPDemo {

    public static void main(String[] args) {
        String ip;
	Scanner scan = new Scanner(System.in);
        ProcessBuilder processBuilder = new ProcessBuilder();
        Process process;
	System.out.println("Enter the ip address");
	ip = scan.nextLine();
        InputStream is;
        
	try{
            InetAddress inet = InetAddress.getByName(ip);
            if(inet.isReachable(5000)){
                process = processBuilder.command("arp", "-a").start();
                is = process.getInputStream();
                BufferedReader buff = new BufferedReader(new InputStreamReader(is));
                
                String res;
                while((res = buff.readLine()) != null){
                    if(res.contains(ip)){
                        res = res.trim();
                        res = res.replaceAll(" +", " ");
                        String[] array = res.split(" ");
                        
                        System.out.println(array[0] + " ==> " + array[1]);
                    }
                }
                
            }else{
                System.out.println("Host is not present");
            }
	}catch(Exception e){
            System.out.println(e);
	}
    }
    
}
