public class Solution {
    // problem: return true if this number is palidrome, otherwise return false
    public boolean isPalindrome(int x) {
        // convert the integer to string
        String s = Integer.toString(x);
        int len = s.length();
        // single number true
        if (len <= 1) return true;
        // negative number false
        else if (x < 0) return false;
        // beginning should equal to the end
        else if (s.charAt(0) != s.charAt(len-1))
            return false;
        // use helper function to detect
        else return helperPalindrome(s.substring(1, len-1));
    }
    
    public boolean helperPalindrome(String a) {
        int as = a.length();
        if (as <= 1) return true;
        else if (a.charAt(0) == a.charAt(as-1))
            return helperPalindrome(a.substring(1, as-1));
        else return false;
    }   
}