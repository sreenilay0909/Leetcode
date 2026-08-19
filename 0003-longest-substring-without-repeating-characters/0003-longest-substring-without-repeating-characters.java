class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] Hash=new int[256];
       for(int i=0;i<256;i++){
        Hash[i]=-1;
       }
       int l=0;
       int r=0;
       int maxlen=0;
       int n=s.length();

       while(r<n){
        if(Hash[s.charAt(r)]!=-1){
            if(Hash[s.charAt(r)]>=l){
                l=Hash[s.charAt(r)]+1;
            }
        }
        int cur=r-l+1;
        Hash[s.charAt(r)]=r;
        r++;
        
        maxlen=Math.max(maxlen,cur);
       }
       return maxlen;
    }
}