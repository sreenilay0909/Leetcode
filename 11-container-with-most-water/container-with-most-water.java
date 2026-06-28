class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right=height.length-1;
        int maxx=0;

        while(left<right){
            int width=right-left;
            int min_h=Math.min(height[left],height[right]);
            int area=min_h*width;

            if(maxx<area){
                maxx=area;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxx;
    }
}