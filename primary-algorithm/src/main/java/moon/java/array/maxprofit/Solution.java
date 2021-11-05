package moon.java.array.maxprofit;

public class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j=0,profit=0;
        while(true){
            if(++j<prices.length){
                if(prices[i]<prices[j]){
                    profit+=prices[j]-prices[i];
                }
                i=j;
            }else {
                break;
            }
        }
        return profit;
    }
}
