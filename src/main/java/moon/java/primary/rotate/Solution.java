package moon.java.primary.rotate;

public class Solution {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums,2);
//        for (int v:nums
//             ) {
//            System.out.print(v);
//        }
    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] nums2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums2[i];
        }
    }
}
