package GreedyAlgorithm;
import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int V = 590;
        int ct=0;
        while(V >0){
        
            if(V >=coins[8]){
            V-=coins[8];
            ct++;
            }
            else if(V >=coins[7]){
                 V-=coins[7];
            ct++;
            }

            else if(V >=coins[6]){
                 V-=coins[6];
            ct++;
            }

            else if(V >=coins[5]){
                 V-=coins[5];
            ct++;
            }

            else if(V >=coins[4]){
                 V-=coins[4];
            ct++;
            }

            else if(V >=coins[3]){
                 V-=coins[3];
            ct++;
            }

            else if(V >=coins[2]){
                 V-=coins[2];
            ct++;
            }

            else if(V >=coins[1]){
                 V-=coins[1];
            ct++;
            }

            else if(V >=coins[0]){
                 V-=coins[0];
            ct++;
            }

            







        
        }
        System.out.println(ct);
    }
    
    
}
