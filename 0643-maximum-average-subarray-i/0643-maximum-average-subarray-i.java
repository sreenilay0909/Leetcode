class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int left =0;
    int curSum=0;
    int maxSum=0;
    for(int i=0;i<k;i++){
        curSum +=nums[i];
    }
    maxSum=curSum;
    for(int rigth=k;rigth<nums.length;rigth++){
        curSum-=nums[left];
        left++;
        curSum+=nums[rigth];
        maxSum=Math.max(maxSum,curSum);
    }
    return(double) maxSum/k;

    }
        

}