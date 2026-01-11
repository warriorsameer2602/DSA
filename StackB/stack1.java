package StackB;
import java.util.*;

public class stack1 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean IsEmpty(){
            return list.size() ==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(IsEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek(){
            if(IsEmpty()){
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args) {
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);

       while(!s.IsEmpty()){
        System.out.println(s.peek());
        s.pop();

       }
    }
}
