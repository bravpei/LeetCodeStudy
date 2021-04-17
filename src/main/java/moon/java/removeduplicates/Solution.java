package moon.java.removeduplicates;

public class Solution {
    public static void main(String[] args) {
        int[] nums= {1,1,2};
        removeDuplicates(nums);
        for (int v:nums) {
            System.out.print(v);
        }
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (true) {
            if (++j < nums.length) {
                if (nums[i] != nums[j]) {
                    i += 1;
                    nums[i] = nums[j];
                }
            } else {
                break;
            }
        }
        System.out.println(i);
        return ++i;
    }
}
