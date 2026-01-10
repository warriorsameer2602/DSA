import java.util.*;
public class Position {
    public static void shortestPath(String str){
        int north =0;
        int south=0;
        int east=0;
        int west=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'N'){
                north ++;
            }
            if(str.charAt(i) == 'S'){
                south ++;
            }
            if(str.charAt(i) == 'W'){
                west ++;
            }
            if(str.charAt(i) == 'E'){
                east ++;
            }
        }
        int x = north - south;
        int y = east - west;
         System.out.println(Math.hypot(x,y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        shortestPath(path);

        
    }
    
}
