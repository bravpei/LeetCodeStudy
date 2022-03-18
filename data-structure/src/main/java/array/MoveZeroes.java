package array;

public class MoveZeroes {
    public void solve(int[] nums) {
        int node=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            nums[node++]=nums[i];
        }
        for(int i=node;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
