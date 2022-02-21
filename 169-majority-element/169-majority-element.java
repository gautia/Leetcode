class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int max=Integer.MIN_VALUE;
        int maxvalue=0;
        for(int i=0;i<nums.length;i++){
            int value=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],value+1);
                if(value>max){
                    max=value;
                    maxvalue=nums[i];
                }
        }
        return maxvalue;
    }
}