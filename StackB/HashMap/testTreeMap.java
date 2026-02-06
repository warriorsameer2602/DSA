package StackB.HashMap;
import java.util.*;
public class testTreeMap {
    public static void main(String[] args) {
       TreeMap<String,Integer> hm = new TreeMap<>();//It sorted based on key in ascendig order.
       hm.put("India",100); 
       hm.put("America",30);
       hm.put("China",150);
       System.out.println(hm);
    }
}
