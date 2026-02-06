package StackB;
import java.util.*;
public class test1 {
    public static void main(String[] args) {
        // LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        // lhm.put("India",100);
        // lhm.put("China",150);
        // lhm.put("Japan",20);
        // System.out.println(lhm);

         HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Japan",20);
        System.out.println(hm);
        System.out.println(hm.get("India"));//This gives the value

    }
    
}
