package moon.java.array.plusone;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2, 6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3};
        plusOne(nums);
    }

    public static int[] plusOne(int[] digits) {
        int a = 0;
        if(digits[digits.length-1]+1>9){
            digits[digits.length-1]=0;
            a=1;
        }else {
            digits[digits.length-1]+=1;
        }
        for (int i = digits.length - 2; i >= 0; i--) {
            if (a == 1) {
                digits[i] = digits[i] + 1;
                if (digits[i]  > 9) {
                    digits[i] = 0;
                    a = 1;
                }else {
                    a=0;
                }
            }
        }
        if(a==0){
            return digits;
        }else {
            int[] ret=new int[digits.length+1];
            ret[0]=1;
            System.arraycopy(digits, 0, ret, 1, digits.length);
            return ret;
        }
    }
}
