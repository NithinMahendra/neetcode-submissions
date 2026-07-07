class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0, left=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[left])
                maxprofit=Math.max(maxprofit,prices[i]-prices[left]);
            else left=i;
        }
        return maxprofit;
    }
}
