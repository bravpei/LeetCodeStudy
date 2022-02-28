package stack;

public class FindTargetSumWays {
    private int count;
    public int solve(int[] nums, int target){
        loop(nums,0,0,target);
        return count;
    }
    public void loop(int[] nums,int deep,int sum,int target){
        if(nums.length==deep){
            if(sum==target){
                count++;
            }
            return;
        }
        loop(nums,deep+1,sum+nums[deep],target);
        loop(nums,deep+1,sum-nums[deep],target);
    }
}
