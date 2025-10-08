
class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int len=nums.length;
        for(int i=0; i<len; i++) {
            count = count^nums[i];
        }
        return count;
    }
}


