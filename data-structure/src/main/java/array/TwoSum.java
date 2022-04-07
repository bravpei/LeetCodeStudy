package array;

public class TwoSum {
    public int[] solve(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]>target){
                j--;
                continue;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
                continue;
            }
            return new int[]{++i,++j};
        }
        return null;
    }
}
