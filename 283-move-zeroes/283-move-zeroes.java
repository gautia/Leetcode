class Solution {
    public void moveZeroes(int[] nums) {
        
        int ind=0;
        if(nums.length ==0 || nums.length ==1 )
            return; 
        for(int num: nums){
            if(num!=0) nums[ind++]=num;
        }
        
        while(ind<nums.length){
            nums[ind++]=0;
        }
    }
}