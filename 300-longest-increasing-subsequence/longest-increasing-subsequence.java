class Solution {
    static int dp[][];
    static int fxn(int arr[], int i,int p){
        if(i==arr.length) return 0;
        if(dp[i][p+1]!=-1) return dp[i][p+1];
        int ex=fxn(arr,i+1,p);
        int in=0;
        if( p==-1 ||arr[i]>arr[p]){
             in=1+fxn(arr,i+1,i);
        }
        return dp[i][p+1]=Math.max(in,ex);
    }
    public int lengthOfLIS(int[] nums) {

        dp=new int[nums.length][nums.length+1];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
       return  fxn(nums,0,-1);
    }
}