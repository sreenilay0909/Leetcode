class Solution {
    public int majorityElement(int[] nums) {
        int mainElement=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                mainElement=nums[i];
            }
            if(nums[i]==mainElement){
                count++;
            }else{
                count--;
            }
        }
        return mainElement;
    }
}