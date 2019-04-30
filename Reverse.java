class Solution {
    public int reverse(int x) {
        long fin = 0;
        
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        
        while(x != 0){
            fin = x % 10 + fin * 10;
            x = x / 10;
        }
        
        if(fin > Integer.MAX_VALUE || fin < Integer.MIN_VALUE)
            return 0;
        
        return (int)fin;
        
    }
}