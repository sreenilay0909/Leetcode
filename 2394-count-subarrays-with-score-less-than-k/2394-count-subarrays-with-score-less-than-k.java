class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt = 0;
        long curSum = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];
            while (curSum * (right - left + 1) >= k) {
                curSum -= nums[left++];
            }
            cnt += right - left + 1;
        }
        
        return cnt;
    }
}