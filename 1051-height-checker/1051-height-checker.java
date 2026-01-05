class Solution {
    public int heightChecker(int[] heights) {
        int res =0;
        int[] ex = new int [heights.length];
        for(int i=0;i<ex.length;i++){
            ex[i]=heights[i];
        }
        Arrays.sort(ex);
        for(int i=0;i< ex.length;i++){
            if(ex[i]!=heights[i]){
                res++;
            }
        }
        return res;
    }
}