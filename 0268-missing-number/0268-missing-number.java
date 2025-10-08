class Solution {
    public int missingNumber(int[] nums) {
       /* int len= nums.length;
        int max=0, min=0;
        for(int i=0; i<len;i++){
            if(i>max){
                max= max+i;

            }
            if(i<)
        }
        */
        
        int n = nums.length;
        int sum = n*(n+1)/2;
        int news= 0;
        for(int i=0;i<nums.length;i++){
            news+=nums[i];
        }
    return sum-news;
    }

}


