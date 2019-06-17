package moon.java;

public class FindMedianSortedArrays4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums=new int[nums1.length+nums2.length];
        int n=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(n<nums1.length&&m<nums2.length){
                nums[i]=nums1[n]<nums2[m]?nums1[n++]:nums2[m++];
            }else if(n<nums1.length){
                nums[i]=nums1[n++];
            }else {
                nums[i]=nums2[m++];
            }
        }
        return nums.length%2==0?Double.valueOf(nums[nums.length/2]+nums[nums.length/2-1])/2:nums[(nums.length-1)/2];
    }
    public static void main(String[] args){
        int[] nums1=new int[]{1,2};
        int[] nums2=new int[]{3,4};
        double ret=findMedianSortedArrays(nums1,nums2);
        System.out.println(ret);
    }
}
