class Solution {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int pro=0;
        for(int i=1;i< prices.length;i++){
            if(prices[i]<b){
                b=prices[i];

            }
            else if (prices[i]-b>pro){
                pro=prices[i]-b;
            }
        }
        return pro;
    }
}