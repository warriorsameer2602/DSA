package StackB.HashMap;
import java.util.*;
public class InterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 145);
        hm.put("China", 144);
        hm.put("US",32 );
        hm.put("Indonesia", 11);
        hm.put("Nepal", 5);

        //Iterate using set

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }

    }
}
