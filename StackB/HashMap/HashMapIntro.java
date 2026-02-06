package StackB.HashMap;
import java.util.*;
public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //insert - O(1)
        hm.put("India", 145);
        hm.put("China",144);
        hm.put("US",32);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        //ContainsKey - O(1)

        System.out.println(hm.containsKey("India"));//true
         System.out.println(hm.containsKey("Indonesia"));//false
        

         //remove-O(1)
         System.out.println(hm.remove("China"));
         System.out.println(hm);

         //size
         System.out.println(hm.size());

         //isEmpty
         System.out.println(hm.isEmpty());

         //make empty the hash map

         hm.clear();
         System.out.println(hm);
    }
}
