package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection {
  public static void main(String[] args) {
    int start[] = {1,3,0,5,8,5};
    int end[] = {2,4,6,7,9,9};

    int maxAct =0;
    ArrayList<Integer> idx = new ArrayList<>();

    //Complete first activity
    maxAct =1;
    idx.add(0);
    int LastAct = end[0];
    for(int i=1;i<end.length;i++){//Start from one as i=1 activity as  already done.
        if(start[i] >= LastAct){
            idx.add(i);
            maxAct++;
            LastAct = end[i];
        }
    }
    System.out.println(maxAct);
    for(int i=0;i<idx.size();i++){
        System.out.print("A" + idx.get(i) + " ");
    }
  }  
}
