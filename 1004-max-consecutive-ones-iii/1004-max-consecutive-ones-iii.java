class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0;
        int l=0;
        int z=0;
        int maxlen=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0) z++;
            if(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            int cur=r-l+1;
            maxlen=Math.max(maxlen,cur);
            r++;
        }
        return maxlen;
    }
}