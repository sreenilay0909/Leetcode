class Solution {
    public int maxProfit(int[] p) {
        int maxprofit=0;
        for(int i=1;i<p.length;i++){
            if(p[i]>p[i-1]){
                int cup=p[i]-p[i-1];
                maxprofit=maxprofit+cup;
            }
        }
        return maxprofit;
    }
}