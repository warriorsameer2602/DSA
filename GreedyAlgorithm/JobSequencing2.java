package GreedyAlgorithm;
import java.util.*;

public class JobSequencing2 {

    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int i,int d,int p){
            id =i;
            deadline =d;
            profit =p;
        }
    }
    public static void main(String[] args) {

        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        
    }
    
}
