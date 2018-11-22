import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author jaseem
 */
public class HttpDocumentPrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HttpURLConnection connection;
        URL url;
        InputStream inputStream;
        String input;
        
        try {
            System.out.println("Enter the URL");
            input = scan.nextLine(); //url should include protocol: 'https' Ex: 'https://www.google.com'
            url = new URL(input);
            connection = (HttpURLConnection) url.openConnection(); //connect with server
            inputStream = connection.getInputStream(); //get it's input stream
            
            int read;
            
            while((read = inputStream.read()) > -1){ //read byte by byte (in binary format)
                char ch = (char) read; // convert a byte to character (i.e, human readable)
                System.out.print(ch); //output the character to display
            }
            scan.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
