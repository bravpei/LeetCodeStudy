package moon.java;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int a;
       for(int i=0;i<nums.length;i++){
           a=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(a==nums[j]){
                    return new int[]{i,j};
                }
            }
       }
       return  null;
    }
    public int[] better(int[] nums,int target){
        Map<Integer,Integer> m=new HashMap<Integer, Integer>();
        int b;
        int[] ret=new int[2];
        for (int i=0;i<nums.length;i++){
            b=target-nums[i];
            if(m.containsKey(b)){
                ret[0]=m.get(b);
                ret[1]=i;
                return ret;
            }
            m.put(nums[i],i);
        }
        return null;
    }
}
