import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author jaseem
 */
public class RetrieveData {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HttpURLConnection connection;
        URL url;
        
        String input;
        
        try {
            System.out.println("Enter the URL");
            input = scan.nextLine(); // url should contain protocol (http/https) otherwise exception is arised 
            url = new URL(input);
            connection = (HttpURLConnection) url.openConnection();
            
            System.out.println("Request Method: " + connection.getRequestMethod());
            System.out.println("Response Code: " + connection.getResponseCode());
            System.out.println("Response Message: " + connection.getResponseMessage());
            
            Map<String, List<String>> headerFields = connection.getHeaderFields(); 
            Set<String> headerKeys = headerFields.keySet();
            
            for(String key: headerKeys){
                System.out.println("Key: " + key + " : " + "Value: " + headerFields.get(key));
            }
            
            connection.disconnect();
            scan.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
