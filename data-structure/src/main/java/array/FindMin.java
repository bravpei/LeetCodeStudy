package array;

public class FindMin {
    public int solve(int[] nums) {
        int l=0,r=nums.length-1;
        while (true){
            if(nums[l]<=nums[r]){
                return nums[l];
            }
            l++;
        }
    }
}
