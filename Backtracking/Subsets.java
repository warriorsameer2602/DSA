package Backtracking;
import java.util.*;

public class Subsets {

    public static void findSubsets(String str, String ans, int i){
        if(i == str.length()){// Base Case
            System.out.println(ans);
            return;
        }

        //yes choice
        findSubsets(str, ans + str.charAt(i), i+1);

        // No choice
        findSubsets(str, ans, i + 1);//Backtracking step
        


    }
   public static void main(String[] args) {
    String s = "abc";
    findSubsets(s, "", 0);
    
   } 
}
