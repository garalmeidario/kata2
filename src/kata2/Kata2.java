package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String data [] = {"Darío", "Alexis", "Darío", "Ainhoa", "Darío", "Alexis", "Ana", "Darío", "Ainhoa"};
        Histogram histo  = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        } 
        
    }
    
}
