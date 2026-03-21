class Solution {
    public int[] plusOne(int[] p) {
        int n=p.length;
        for(int i=n-1;i>=0;i--){
            if(p[i]+1!=10){
                p[i]+=1;
                return p;
            }
            p[i]=0;
        }
        int[] newnum=new int[n+1];
        newnum[0]=1;
        return newnum;
    }
}