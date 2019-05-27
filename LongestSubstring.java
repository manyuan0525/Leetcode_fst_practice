public class Solution {
    // problem: return the longestsubstring without repeating in the given string
    public int lengthOfLongestSubstring(String s) {
        // Build a new list with length 128(# of ASCII code)
        int[] characters = new int[128];
        int left = 0;
        int max = 0;
        // loop the string
        for (int i = 0; i < s.length(); i++) {
            // get the char of corresponding index
            char c = s.charAt(i);
            // there exists repetition
            if (characters[c] > 0) {
                // compute the max substring so far
                max = Math.max(max, i - left);
                // if there are two same char, restart left at i 
                if (s.charAt(i - 1) == c) left = i;
                else left = Math.max(left, characters[c]);
                characters[c] = i + 1;
            } else {
                characters[c] = i + 1; 
            }
        }
        max = Math.max(max, s.length() - left);
        return max == 0 ? s.length() : max;
    }
}