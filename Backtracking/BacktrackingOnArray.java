package Backtracking;
import java.util.*;
public class BacktrackingOnArray {

    public static void BacktrackingArray(int arr[],int i,int val){
        //Base case

        if(i == arr.length){
            printArr(arr);
            return;
        }

        // Recursion

        arr[i] = i + val;
        BacktrackingArray(arr, i+1, val);
        arr[i] = arr[i] -2; //Backtracking step


    }
    

    public static void  printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        BacktrackingArray(arr,0,1);
        printArr(arr);

    }
}
