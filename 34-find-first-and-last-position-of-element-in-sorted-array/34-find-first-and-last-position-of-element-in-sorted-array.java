class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0,end;
        int count=0;
        int array[] = new int [2];
        array[0]=array[1]=-1;
        if(nums.length==0) return new int[]{-1,-1};
        if(nums.length==1) 
            if(nums[0]==target)
            return new int[]{0,0};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(count>1) array[1]=i;
                else
                {
                array[count]=i;
                count++;
                }
            }
        }
        if(count>1) return array;
        if(count==1) {array[1]=array[0]; return array;}
        return new int[]{-1,-1};
    }
}