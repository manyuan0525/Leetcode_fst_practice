public class Solution {
    public int myAtoi(String str) {
         
        if(str == null || str.length() == 0) return 0;
        
        char[] ca = str.toCharArray();
             
        int index = 0;
        while(index < str.length() && ca[index] == ' '){
            index++;
        }
        
        if(index < str.length() && !Character.isDigit(ca[index]) && ca[index] != '-' && ca[index] != '+') return 0;
        
        int sign = 1;
        
        if(index < str.length()){                
            if(ca[index] == '-')
            {
                sign = -1;
                index++;
            }
            
            else if(ca[index] == '+'){
                sign = 1;
                index++;
            }
         
        } 
        
        if(index < str.length() && !Character.isDigit(ca[index])) return 0;
                        
        int sum = 0;
        
        while(index < str.length() && Character.isDigit(ca[index])){
            
            
            if(Integer.MAX_VALUE/10 < sum || Integer.MAX_VALUE/10 == sum && Integer.MAX_VALUE % 10 < (ca[index] - '0'))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            sum = sum * 10 + (ca[index] - '0');
            index++;
        }
        
        return sum * sign;
        
    }
}