/*
class Solution {
    public char findTheDifference(String s, String t) {
        String comb= s+t;
        int res=0;
        for(int i=0;i<comb.length();i++){
        res^= s.charAt(i);
        }

        
        return (char)res;
    }
}
*/

class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        String comb = s + t;
        for (int i = 0; i < comb.length(); i++) {
            res ^= comb.charAt(i);
        }
        return (char) res;
    }
}
