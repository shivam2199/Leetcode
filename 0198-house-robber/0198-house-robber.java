class Solution {
    int dp[];
    public int rob(int[] nums) {
        dp = new int [nums.length];
        int i;
        for (i=0;i<nums.length;i++){
            dp[i]=-1;
        }
        return solve(nums, nums.length-1);
    }
    public int solve (int nums[], int i){
        if (i==-1 || i==-2)
            return 0;
        if (dp[i]!=-1)
            return dp[i];
        dp[i] = (int)Math.max(nums[i]+solve(nums, i-2), solve(nums,i-1));
        return dp[i];
    }
}