class Solution {
    static int dp[][];
    static int fxn(int arr[],int i,int sum1,int sum2 ){
        if(i==arr.length) return Math.abs(sum1-sum2);
        if(dp[i][sum1]!=-1) return dp[i][sum1];
        int in=fxn(arr,i+1,sum1+arr[i],sum2);
        int ex=fxn(arr,i+1,sum1,sum2+arr[i]);
        return dp[i][sum1]=Math.min(ex,in);
    }
    public int lastStoneWeightII(int[] stones) {
    int total=0;
    for(int x:stones) total+=x;
        dp=new int[stones.length][total+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return fxn(stones,0,0,0);
    }
}