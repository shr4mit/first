class Solution {
    static int dp[][];
    static int offset;
    static int fxn(int arr[], int i,int sum,int target){
        if(i==arr.length){
          if(sum==target) return 1;
        return 0;
        }
         if(dp[i][sum+offset]!=-1) return dp[i][sum+offset];
        int ex=fxn(arr,i+1,sum-arr[i],target);
        int in=fxn(arr,i+1,sum+arr[i],target);
        return dp[i][sum+offset]= ex+in;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int x:nums) total+=x;
        offset=total;
        dp=new int[nums.length+1][2*total+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        if(Math.abs(target)>total) return 0;
        return fxn(nums,0,0,target);
    }
}