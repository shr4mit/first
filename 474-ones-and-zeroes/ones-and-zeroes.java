class Solution{
    static int dp[][][];
    static int fxn(String[] strs,int i,int m,int n){
        if(i==strs.length){
            return 0;
        }
        if(dp[i][m][n]!=-1){
            return dp[i][m][n];
        }
        int zero=0;
        int one=0;
        for(int j=0;j<strs[i].length();j++){
            if(strs[i].charAt(j)=='0'){
                zero++;
            }else{
                one++;
            }
        }
        int ex=fxn(strs,i+1,m,n);
        int in=0;
        if(zero<=m&&one<=n){
            in=1+fxn(strs,i+1,m-zero,n-one);
        }
        return dp[i][m][n]=Math.max(in,ex);
    }
    public int findMaxForm(String[] strs,int m,int n){
        dp=new int[strs.length][m+1][n+1];
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<=m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return fxn(strs,0,m,n);
    }
}