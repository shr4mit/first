class Solution {
    static int dp[][];
    static int fxn(int arr[], int i, int target,int sum){
        if(sum==target){ return 0;
        }
         if(i==arr.length||sum>target)
         return 10000000;
        
         if(dp[i][sum]!=-1) return dp[i][sum];

        int ex=fxn(arr,i+1,target,sum);
        int in =100000000;
         if(arr[i]<=target-sum)
         in =1+fxn(arr,i,target,sum+arr[i]);
        return dp[i][sum]= Math.min(in,ex);
    }
    public int coinChange(int[] coins, int amount) {
        dp=new int[coins.length+1][amount+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        int ans= fxn(coins,0,amount,0);
        if(ans>=10000000){
            return -1;
        }
        return ans;
    }
}