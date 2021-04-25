package moon.java.primary.array.singlenumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int l=nums.length;
        for (int i=0;i<l;i++){
            int j=i;
            while(true){
                if(++j<l){
                    if(nums[i]==nums[j]){
                        if(j!=l-1){
                            int a=nums[l-1];
                            nums[l-1]=nums[j];
                            nums[j]=a;
                        }
                        l--;
                        break;
                    }
                }
                if(j>=l){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
