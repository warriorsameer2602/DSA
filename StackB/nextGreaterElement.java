package StackB;
import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6 , 8 , 0 , 1 , 3 };
        int nextGreater[] = new int[arr.length];

        for(int i =arr.length -1;i>=0;i--){//Backward treversal of array

            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){//comparing current element in arr with its previous one in backward way
                s.pop();//WE are removing the smallest element 
            }


            //2 if-else
                if(s.isEmpty()){
                    nextGreater[i] = -1;

                }
                else{
                    nextGreater[i] = arr[s.peek()];
                }

                //3 push in s
                s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i] + " ");
        }

        //Here overall time complexity is O(N)

    }
}
