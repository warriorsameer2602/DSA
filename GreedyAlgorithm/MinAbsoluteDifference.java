package GreedyAlgorithm;
import java.util.*;
public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int A[] ={1,2,3};
        int B[] = {2,1,3};
        int minDiff =0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i] - B[i]);

        }

        System.out.println(minDiff);
    }
}
