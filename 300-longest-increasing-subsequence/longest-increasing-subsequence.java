class Solution {
    static int dp[];
    static int fxn(int arr[], int i) {
        if(i==0) return 1;
        if(dp[i]!=-1) return dp[i];
        int mx=1;
        for(int j=i-1;j>=0;j--) {
            if(arr[i]>arr[j]) {
                mx=Math.max(mx,1+fxn(arr,j));
            }
        }
        return dp[i]=mx;
    }
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            dp[i]=-1;
        int ans=0;
        for(int i=0;i<nums.length;i++)
            ans=Math.max(ans,fxn(nums,i));
        return ans;
    }
}