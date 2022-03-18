package array;

public class FindMaxConsecutiveOnes {
    public int solve(int[] nums) {
        int max=0,count=0;
        for(int i:nums){
            if(i==1){
                count++;
                continue;
            }
            max=Math.max(max,count);
            count=0;
        }
        max=Math.max(max,count);
        return max;
    }
}
