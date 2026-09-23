class Solution {
    static int dp[][];
    static int fxn(int arr[], int i, int sum, int target){
        if (sum==target) return 1;
        if(i==arr.length || sum>target) return 0;
        if(dp[i][sum]!=-1) return dp[i][sum];
        
        int ex =fxn(arr, i+1,sum,target);
      
       int in=fxn(arr,i,sum+arr[i],target);
        return dp[i][sum]= ex+in;
    }
    public int change(int amount, int[] coins) {
       
        dp = new int [coins.length+1][amount+1];
        for(int y[]:dp){
            Arrays.fill(y,-1);
        }
        return fxn(coins,0,0,amount);
    }
}