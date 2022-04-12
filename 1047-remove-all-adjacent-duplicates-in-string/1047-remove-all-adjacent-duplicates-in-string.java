class Solution {
    public String removeDuplicates(String s) {
        StringBuilder newstr= new StringBuilder();
        if(s.length()==0 || s.length()==1)
            return s;
        
        newstr=newstr.append(s.charAt(0));
        int ind=0;
        for(int i=1;i<s.length();i++){
            
            if((newstr.length()>0 && newstr.charAt(newstr.length()-1)==s.charAt(i)))
                newstr.deleteCharAt(newstr.length()-1);
            else
                newstr=newstr.append(s.charAt(i));
        }
        
        return newstr.toString();
    }
}