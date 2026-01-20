package StackB;
import java.util.*;
public class Duplicateparentheses {

    public static boolean isDuplicateParentheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // For closing parentheses

            if(ch == ')'){
                int count =0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;//duplicate found
                }
                else{
                    s.pop();//open parenthese will be popped
                }
            }
            else{// For pushing opening parentheses
                s.push(ch);
            }
        }
        return false;


    }
    public static void main(String[] args) {
        
        String str = "((a+b))";//true
        String str2 ="(a-b)";//false
        System.out.println(isDuplicateParentheses(str));
        System.out.println(isDuplicateParentheses(str2));
    }
    
}
