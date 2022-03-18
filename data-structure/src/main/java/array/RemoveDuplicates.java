package array;

public class RemoveDuplicates {
    public int solve(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int length=1,last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==last){
                continue;
            }
            nums[length++]=nums[i];
            last=nums[i];
        }
        return length;
    }
}
