package Backtracking;
import java.util.*;
public class Permutation {
    public static void Permutation(String str,String ans){
        //Base case
        if(str.length() ==0){
            System.out.println(ans);
            return;
        }

         //Recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            //"abcde" --> "ab" + "de" =="abde"
            String Newstr = str.substring(0,i) + str.substring(i+1); // removing selected element from orginal str
            Permutation(Newstr,ans+curr);//inserting that curr char to ans string

        }
    }
    public static void main(String[] args) {
        String s = "abc";
        Permutation(s,"");

       
    }
    
}
