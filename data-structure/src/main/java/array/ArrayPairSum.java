package array;

import java.util.Arrays;

public class ArrayPairSum {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int i=0;
        while(i<nums.length){
            sum+=nums[i];
            i+=2;
        }
        return sum;
    }
}
