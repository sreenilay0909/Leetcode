class Solution {
    public boolean containsDuplicate(int[] nums) {
        int l=nums.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        return l!=h.size();
    }
}