package StackB.HashMap;
import java.util.*;

public class LargestZeroSubarray {
    public static int largestZeroSubarray(int arr[]){
        HashMap<Integer,Integer> sum = new HashMap<>();
        int s =0;
        int l=0;
        for(int i=0;i<arr.length;i++){
            s+= arr[i];
            if(sum.containsKey(s)){
                l= i-sum.get(s);
            }
            else{
                sum.put(s,i);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] ={15,-2,2,-8,1,7,1,-1};
        System.out.println(largestZeroSubarray(arr));

    }
}
