class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
       int len = nums.length;
        if (len < 3) return 0;
        int[] dp = new int[len];
        int ans = 0;

        for (int i = 2; i < len; i++){
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]){
                dp[i] = dp[i - 1] + 1;
                ans += dp[i];
            }
        }
        return ans;
    }
}