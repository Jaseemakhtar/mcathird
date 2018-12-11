import java.util.*;

/**
 *
 * @author jaseem
 */

class FrequencyCounter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] rWords;
        ArrayList<String> nWords = new ArrayList<String>();
        ArrayList<Integer> nFreq = new ArrayList<Integer>();
        System.out.println("Enter the line");
        String line = scan.nextLine();
        line = line.trim();
        line = line.replaceAll(" +", " ");
        rWords = line.split(" ");
        
        for(int i = 0; i < rWords.length; i++){
            String current = rWords[i];
            int repeatition = 0;
            
            for(int j = 0; j < rWords.length; j++){
                if(current.equals(rWords[j])){
                    repeatition++;
                }
            }
            
            if(!nWords.contains(current)){
                nWords.add(current);
                nFreq.add(repeatition);
            }
        }
        
        for(int i = 0; i < nWords.size(); i++){
            System.out.println(nWords.get(i) + " : Freq =  " + nFreq.get(i));
        }
        
        System.out.println("Total Characters: " + line.length());
    }
    
    
}

