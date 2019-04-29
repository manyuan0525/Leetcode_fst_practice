class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        
        StringBuilder conv = new StringBuilder();
        int len = s.length();
        int c = 2 * numRows - 2;
        
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j + i < len; j += c){
                conv.append(s.charAt(j+i));
                if(i != 0 && i != numRows -1 && j + c - i < len)
                    conv.append(s.charAt(j+c-i));
            }
        }
        return conv.toString();
    }
}