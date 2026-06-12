class Solution {
    public int maxProfit(int[] p) {
        int min=p[0];
        int maxc=0;
        for(int i=1;i<p.length;i++){
            if(p[i]<min){
                min=p[i];
            }
            int profit=p[i]-min;
            if(maxc<profit){
                maxc=profit;
            }
        }
        return maxc;
    }
}