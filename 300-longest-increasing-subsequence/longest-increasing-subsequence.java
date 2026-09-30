class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++) {
            dp[i]=1;
            for(int j=i-1;j>=0;j--) {
                if(nums[i]>nums[j]) {
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++)
            ans=Math.max(ans,dp[i]);
        return ans;
    }
}