package StackB;
import java.util.*;
public class stack6 {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);//To push the poped item.

    }


    public static void reverseStack(Stack<Integer> s ){
        if(s.empty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);
        printStack(s);
        reverseStack(s);
        System.out.println("After reversing:");
        printStack(s);
    }
}
