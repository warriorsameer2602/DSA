package GreedyAlgorithm;
import java.util.*;
public class JobSequencingProblem {
    public static void main(String[] args) {
        int jobs[][] = {{4,20},{1,10},{1,40},{1,30}};
        

        Arrays.sort(jobs,Comparator.comparingDouble(o -> o[1]));//Sorted in ascending order
        ArrayList<Integer> ans = new ArrayList<>();
        int time =0;
        int profit=0;
        for(int i=jobs.length-1;i>=0;i--){
            if(jobs[i][0] >time){
                ans.add(jobs[i][0]);
                profit+=jobs[i][1];
                time++;


            }
        }

        System.out.println(profit);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

       

    }
    
}
