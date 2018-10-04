package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer data [] = {1,-1,0,100,1,1,1,2,89,666,15,2,-1,100,100};
        Histogram histo  = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        } 
        
    }
    
}
