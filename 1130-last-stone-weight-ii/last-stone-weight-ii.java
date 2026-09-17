class Solution{
    public int lastStoneWeightII(int[] stones){
        int total=0;
        for(int x:stones) total+=x;
        int dp[][]=new int[stones.length+1][total+1];
        dp[0][0]=1;
        for(int i=1;i<=stones.length;i++){
            dp[i][0]=1;
            for(int j=1;j<=total;j++){
                int ex=dp[i-1][j];
                int in=0;
                if(j>=stones[i-1]){
                    in=dp[i-1][j-stones[i-1]];
                }
                dp[i][j]=Math.max(ex,in);
            }
        }
        int min=total;
        for(int j=0;j<=total/2;j++){
            if(dp[stones.length][j]==1){
                int s1=j;
                int s2=total-j;
                min=Math.min(min,s2-s1);
            }
        }
        return min;
    }
}