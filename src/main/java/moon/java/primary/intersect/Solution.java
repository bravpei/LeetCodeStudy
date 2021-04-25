package moon.java.primary.intersect;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    int a = nums1[m - 1];
                    nums1[m - 1] = nums1[i];
                    nums1[i] = a;
                    int b = nums2[n - 1];
                    nums2[n - 1] = nums2[j];
                    nums2[j] = b;
                    m--;
                    n--;
                    i--;
                    break;
                }
            }
        }
        return ret(nums2, n);
    }

    int[] ret(int[] nums, int l) {
        int[] ret = new int[nums.length-l];
        int j = 0;
        for (int i = l; i < nums.length; i++) {
            ret[j++] = nums[i];
        }
        return ret;
    }
}
