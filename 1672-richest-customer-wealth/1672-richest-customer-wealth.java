class Solution {
    public int maximumWealth(int[][] a) {
        int res=0;
        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=0;j<a[i].length;j++){
                temp=temp+a[i][j];
            }
            res= Math.max(temp, res);
        }
        return res;
    }
}