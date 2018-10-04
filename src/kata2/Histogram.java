package kata2;


import java.util.HashMap;
import java.util.Map;



public class Histogram {
    private final int [] data;
    private Map<Integer, Integer> histogram= new HashMap<>();
    
    public Histogram(int [] data) {
        this.data = data;
    }

    public Map getHistogram(){
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        return histogram;
    }
    
    
}
