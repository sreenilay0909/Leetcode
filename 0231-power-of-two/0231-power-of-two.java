class Solution {
    public boolean isPowerOfTwo(int n) {

        /*
        for(int i=0;i<n;i++){
            if(Math.pow(2, i)==n){
                return true;
            }
            else{
                return false;
            }
        }
        */
        if(n<0)return false;
        for(int i=0;i<31;i++){
            if((1<<i)==n){
                return true;
            }
        }
           return false;
    }
}