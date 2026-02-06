package StackB.HashMap;
import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }

         for(int i =0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }

        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs2.add(arr1[i]);
        }
        int ct =0;
        for(int i=0;i<arr2.length;i++){
            if(hs2.contains(arr2[i])){
                ct++;
                hs2.remove(arr2[i]);
            }
        }

        System.out.println("Union elements are: " + hs.size());
        System.out.println("Intersection element are: " + ct);
    }
}
