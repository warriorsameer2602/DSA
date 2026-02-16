package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection2 {
    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};

        int data[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            data[i][0] = i;//fixing index according the given data;
            data[i][1] = start[i];
            data[i][2] = end[i];
        }

        Arrays.sort(data,Comparator.comparingDouble(o -> o[2]));
        

        ArrayList<Integer> idx = new ArrayList<>();
        int maxAct =1;
        idx.add(data[0][0]);//first activity done;
        int LastAct = data[0][2];
        for(int i=0;i<end.length;i++){
            if(data[i][1] >= LastAct){
                idx.add(data[i][0]);
                maxAct++;
                LastAct = data[i][2];
            }
        }

        System.out.println(maxAct);
        for(int i=0;i<idx.size();i++){
            System.out.print("A" + idx.get(i) + " ");
        }

    }
}
