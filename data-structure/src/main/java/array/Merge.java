package array;

import java.util.HashSet;
import java.util.Set;

public class Merge {
    public int[][] solve(int[][] intervals) {
        Set<Integer> expel=new HashSet<>();
        for(int i=0;i<intervals.length;i++){
            int[] interval=intervals[i];
            for(int j=i+1;j<intervals.length;j++){
                if(interval[1]>=intervals[j][0]&&interval[0]<=intervals[j][1]){
                    intervals[j][0]=Math.min(interval[0],intervals[j][0]);
                    intervals[j][1]=Math.max(interval[1],intervals[j][1]);
                    expel.add(i);
                    break;
                }
            }
        }
        int[][] ret=new int[intervals.length-expel.size()][2];
        int j=0;
        for(int i=0;i<intervals.length;i++){
            if(!expel.contains(i)){
                ret[j++]=intervals[i];
            }
        }
        return ret;
    }
}
