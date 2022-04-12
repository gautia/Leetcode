class Solution {
    public int missingNumber(int[] nums) {
        int ind=0;
        boolean chk=true;
       while(ind>=0 && chk){
           chk=false;
           for(int num: nums){
               if(ind==num){
                    chk=true;
                   break;
               }
       }
           ind++;
       }
        return ind-1;
    }
}