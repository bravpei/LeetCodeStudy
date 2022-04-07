package array;

public class MinSubArrayLen {
    public static int solve(int target, int[] nums) {
        int total = 0, min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (j < nums.length) {
            total += nums[j];
            if (total >= target) {
                while (true) {
                    min = Math.min(min, j - i + 1);
                    if (total - nums[i] >= target) {
                        total -= nums[i++];
                    } else {
                        break;
                    }
                }
            }
            j++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        solve(7, nums);
    }
}
