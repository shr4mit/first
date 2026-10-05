class Solution {
    static int dp[][];
    static int fxn(String s , String t, int i, int j){
        if(i==s.length()|| j==t.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
        dp[i][j]=1+fxn(s,t,i+1,j+1);
        } else{
            dp[i][j]=Math.max(fxn(s,t,i+1,j),fxn(s,t,i,j+1));
        }
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return fxn(text1,text2,0,0);
    }
}