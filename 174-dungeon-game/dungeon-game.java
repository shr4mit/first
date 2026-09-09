class Solution {
    int n,m;
    int dp[][];
public int fxn(int i, int j, int dungeon[][]){
    if(i>=n || j>=m) return Integer.MAX_VALUE;
    if(i==n-1 && j==m-1)
    return Math.max(1,1-dungeon[i][j]);
    if(dp[i][j]!=0) return dp[i][j];
    int r=fxn(i,j+1,dungeon);
    int d=fxn(i+1,j,dungeon);
    int res=Math.max(1,Math.min(r,d)-dungeon[i][j]);
    return dp[i][j]=res;
}
    public int calculateMinimumHP(int[][] dungeon) {
        n= dungeon.length;
        m=dungeon[0].length;
        dp=new int[n][m];
        return fxn(0,0,dungeon);      
    }

}