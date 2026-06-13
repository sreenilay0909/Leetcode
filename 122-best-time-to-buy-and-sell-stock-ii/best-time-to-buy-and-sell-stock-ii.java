class Solution {
    public int maxProfit(int[] p) {
        int mp=0;
        int cp=0;
        for(int i=1;i<p.length;i++){
            if(p[i]>p[i-1]){
                cp=p[i]-p[i-1];
                mp=mp+cp;
            }
        }
        return mp;
    }
}