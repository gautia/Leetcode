class Solution {
    public int reverse(int x) {
        
        int newint=0;
        while(x!=0){
            int rem = x%10;
            x=x/10;
            
             if (newint > Integer.MAX_VALUE/10 || (newint == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (newint < Integer.MIN_VALUE/10 || (newint == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            
            newint= newint* 10 + rem;
        }
        
        return newint;
    }
}