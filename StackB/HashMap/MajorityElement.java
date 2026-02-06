package StackB.HashMap;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3};
    
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i < arr.length;i++){
       if(freq.containsKey(arr[i])){
        freq.put(arr[i],freq.get(arr[i]) + 1);

       }

       else{
        freq.put(arr[i],1);
       }

        }

        System.out.println(freq);
        for(int k : freq.keySet()){
            if(freq.get(k) > arr.length/3){
                System.out.print(k + " ");
            }
        }

    }
}
