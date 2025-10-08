class Solution {
    public int minBitFlips(int start, int goal) {
        int result=start^goal,cnt=0;
        while(result!=0) {
            cnt+=(result & 1)!=0 ? 1:0;
            result=result>>1;
        }
        return cnt;
    }
}