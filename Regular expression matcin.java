public class Solution {
    public boolean isMatch(String s, String p) {
        // base case: either s or p is empty
        if (s == null || p == null) {
            return false;
        }
        // build a 2d list to record the true false for each char
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        // first loop check 
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i-1]) {
                dp[0][i+1] = true;
            }
        }
        // second loop
        for (int i = 0 ; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                // "." exists -> s and p go to next index
                if (p.charAt(j) == '.') {
                    dp[i+1][j+1] = dp[i][j];
                }
                // the char at s and p are equal -> s and p go to next index 
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                }
                // "*" judge the previous char of p and s are equal or not, and p not equal to "."
                if (p.charAt(j) == '*') {
                    if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.') {
                        dp[i+1][j+1] = dp[i+1][j-1];
                    } else {
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}