class Solution {
    public int findTargetSumWays(int[] nums,int target) {
        int total=0;
        for(int x:nums){
            total+=x;
        }
        int offset=total;
        int dp[][]=new int[nums.length+1][2*total+1];
        dp[0][offset]=1;
        for(int i=0;i<nums.length;i++){
            for(int sum=-total;sum<=total;sum++){
                if(dp[i][sum+offset]>0){
                dp[i+1][sum+nums[i]+offset]+=dp[i][sum+offset];
                dp[i+1][sum-nums[i]+offset]+=dp[i][sum+offset];
                }
            }
        }
        if(target>total||target<-total)return 0;
        return dp[nums.length][target+offset];
    }
}