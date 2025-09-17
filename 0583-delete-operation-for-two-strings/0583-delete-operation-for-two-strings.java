class Solution {
    public int lcs(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        if(m > n) return lcs(word2, word1); 
        int dp[] = new int[m+1];

        for(int i=1; i<n+1; i++) {
            int prevDiag = 0;
            for(int j=1; j<m+1; j++) {
                int prevTop = dp[j];
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[j] = prevDiag + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j-1]);
                }
                prevDiag = prevTop;
            }
        }

        return dp[m];
    }

    public int minDistance(String word1, String word2) {
        int lcsLength = lcs(word1, word2);
        return (word1.length()-lcsLength) + (word2.length()-lcsLength);
    }
}