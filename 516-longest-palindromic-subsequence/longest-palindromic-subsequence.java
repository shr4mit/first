class Solution {
    static int dp[][];
    
    static int fxn(String s,int i,int j){
        if(i==j) return 1;
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
     if(s.charAt(i)==s.charAt(j)){
         ans=ans+2+fxn(s,i+1,j-1);
      
     }else{
        int ex=fxn(s,i+1,j);
        int in=fxn(s,i,j-1);
        ans+=Math.max(in,ex);
     }
      return dp[i][j]=ans;
    }
    public int longestPalindromeSubseq(String s) {
        dp=new int[s.length()+1][s.length()+1];
         for(int x[]:dp){
            Arrays.fill(x,-1);
         }
       return  fxn(s,0,s.length()-1);
        
    }
}