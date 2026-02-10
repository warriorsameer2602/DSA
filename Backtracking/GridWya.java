package Backtracking;
import java.util.*;
public class GridWya {

    public static int countGridWays(int i,int j, int n, int m){
        //Base Case
        if(i == n-1 && j==m-1){//Reaching target position
            return 1;
        }

        if(i ==n || j ==m){//Going outside the grid
            return 0;
        }

        int w1 = countGridWays(i+1, j, n, m);//Move in Right direction
        int w2 = countGridWays(i, j+1, n, m);//Move in Down direction
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n=3; int m=3;
        System.out.println(countGridWays(0, 0, n, m));

        
    }
}
