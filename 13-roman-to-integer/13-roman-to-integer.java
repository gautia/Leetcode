class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
       // int total;
        
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
    
      //  for(int i=0;i<s.length();i++)
        //    total+=hm.get(s.charAt(i));
        
        int len = s.length();
      int  total = hm.get(s.charAt(len - 1));
	    for (int i = len - 2; i >= 0; i--) {
		if (hm.get(s.charAt(i)) >= hm.get(s.charAt(i + 1)))
			total += hm.get(s.charAt(i));
		else
			total -= hm.get(s.charAt(i));
        
        }
        return total;
    }
}