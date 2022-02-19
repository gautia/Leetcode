class Solution {
    public int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        int currentValue=0;
        for(int i=0;i<nums.length;i++){
            currentValue+=nums[i];
            
            if(currentValue>max)
                    max=currentValue;  
            if(currentValue<0)
                currentValue=0;
        }
    
        return max;
}
}