import java.util.*;
public class Sam{
    public static void checkPalindrome(String str){
    int count = str.length();
    for(int i =0;i <str.length();i++){
if(str.charAt(i) == str.charAt(str.length()-(i + 1))){
    count--;
}
    }
    if(count ==0 ){
        System.out.println("Given word is a Plaindrome");
    }
    else{
        System.out.println("Given word is not a Palindrome");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //System.out.println(name.length());
        checkPalindrome(name);
        
    }
}