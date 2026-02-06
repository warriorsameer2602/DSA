package StackB.HashMap;
import java.util.*;
public class ValidAnagram {
    public static boolean checkValidAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
         LinkedHashMap<Character,Integer> fir = new LinkedHashMap<>();
         LinkedHashMap<Character,Integer> sec = new LinkedHashMap<>();


         for(int i=0;i<s.length();i++){//Insertion on LinkedHashMap
            if(fir.containsKey(s.charAt(i))){
                fir.put(s.charAt(i),fir.get(s.charAt(i)) + 1);
            }
            else{
                fir.put(s.charAt(i), 1);
            }
         }


          for(int i=0;i<t.length();i++){// Insertion on 2nd LinkedHashMap.
            if(sec.containsKey(t.charAt(i))){
                sec.put(t.charAt(i),fir.get(t.charAt(i)) + 1);
            }
            else{
                sec.put(t.charAt(i), 1);
            }
         }


           for(char k : fir.keySet() ){
            if(fir.get(k) != sec.get(k)){
                return false;
            }
         }

         return  true;
    }
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
       System.out.println(checkValidAnagram(s,t));

       

         
    }
}
