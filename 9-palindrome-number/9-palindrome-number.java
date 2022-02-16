class Solution {
    public boolean isPalindrome(int x) {
      String s=String.valueOf(x);
        int ind=0;
       for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)!=s.charAt(ind))
               return false;
           ind++;
       }
           return true;
    }
}