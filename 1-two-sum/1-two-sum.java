class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        
        int numToFind;
        int rt[] = new int[2];
       for(int i=0;i<nums.length;i++){
           numToFind = target-nums[i];
                         //    System.out.println(numToFind);

           for(int j=i+1;j<nums.length;j++){
               if(nums[j]==numToFind){
                  // System.out.println(numToFind);
                   rt[0]=i;rt[1]=j;
                   return rt;
               }
       }
	/*/
         int numToFind;
        int rt[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
              numToFind = target-nums[i];
            if(hm.containsKey(numToFind)){
                rt[0]=hm.get(numToFind);rt[1]=i;
                   return rt; 
            }
            else
                hm.put(nums[i],i);
        }
    
         return null;
       
}
    
}