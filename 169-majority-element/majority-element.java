class Solution {
    public int majorityElement(int[] nums) {
        int main=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                main=nums[i];
            }
            if(nums[i]==main){
                count++;
            }
            else count--;
        }
        return main;
    }
}