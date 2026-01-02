class Solution {
    public int maxSubArray(int[] nums) {
        int ansss= nums[0];
        for(int i=1,f=nums[0];i< nums.length;++i){
            f=Math.max(f,0)+nums[i];
            ansss=Math.max(ansss,f);
        }
        return ansss;
    }
}