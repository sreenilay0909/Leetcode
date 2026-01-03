class Solution {
    public int pivotIndex(int[] nums) {
        int t_s=0;
        for(int num: nums) t_s+=num;
        int l_s=0;
        for(int i=0;i< nums.length;i++){
            int r_s=t_s-l_s-nums[i];
            if(l_s==r_s) return i;
            l_s+=nums[i];
        }
        return -1;
    }
}