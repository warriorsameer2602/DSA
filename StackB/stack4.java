//Ques:- Push the element at the bottom of stack.

package StackB;
import java.util.*;
public class stack4 {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);//To push the poped item.

    }



    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
    pushAtBottom(s, 4);
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
    }
}
